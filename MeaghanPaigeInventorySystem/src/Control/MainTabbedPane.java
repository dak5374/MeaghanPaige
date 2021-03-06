/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import View.InvoicePanel;
import View.InventoryPanel;
import View.WelcomePanel;
import View.ClientPanel;
import View.CustomerPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import meaghanpaigeinventorysystem.Client;
import meaghanpaigeinventorysystem.Invoice;

public class MainTabbedPane extends JFrame {

    WelcomePanel wp;

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    WelcomePanel welcomePanel = new WelcomePanel();
    InvoicePanel invoicePanel = new InvoicePanel();
    InventoryPanel inventoryPanel = new InventoryPanel();
    ClientPanel clientPanel = new ClientPanel();
    CustomerPanel customerPanel = new CustomerPanel();

    JTabbedPane mainTabbedPane = new JTabbedPane();
    
    //creates the JFrame with tabs for each JPanel.
    
    public MainTabbedPane() {

        mainTabbedPane.add("Welcome Panel", welcomePanel);
        mainTabbedPane.add("Invoice Panel", invoicePanel);
//        mainTabbedPane.add("Inventory Panel", inventoryPanel);
        mainTabbedPane.add("Client Panel", clientPanel);
        mainTabbedPane.add("Customer Panel", customerPanel);

        add(mainTabbedPane);        

        try {
            //loads the JDBC driver that allows the application to connect to the database.
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (ClassNotFoundException cnfex) {

            System.out.println("Problem in loading or "
                    + "registering MS Access JDBC driver");
            cnfex.printStackTrace();
        }

        try {
            //creates necessary strings to allow the application to find the location of the database utilizing the UcanaccessDriver.
            String msAccDB = "IST440MeaghanPaige.accdb";
            String dbURL = "jdbc:ucanaccess://src/meaghanpaigeinventorysystem/" + msAccDB;
            connection = DriverManager.getConnection(dbURL);
            //after connection to the database is secured, the invoice panel createInvoiceButton is retrieved and fitted with an ActionListener. This will check to make sure all fields are properly completed.
            invoicePanel.getCreateInvoiceButton().addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {
                    Statement statement;
                    try {
                        if (invoicePanel.getDiscountText().getText().equals("Discount") || invoicePanel.getTaxText().getText().equals("Tax (%)")
                                || invoicePanel.getRetailPriceText().getText().equals("Retail Price") || invoicePanel.getServiceDescText().getText().equals("Service Description")
                                || invoicePanel.getClientComboBox().getSelectedItem().toString().equals("Client") || invoicePanel.getPaymentComboBox().getSelectedItem().toString().equals("Payment Type")) {
                            invoicePanel.getWarningLabel().setForeground(Color.red);
                            invoicePanel.getWarningLabel().setText("ERROR, Please check all fields and try again!");
                        } else {
                        Invoice tempInvoice = invoicePanel.importInvoice();
                        statement = connection.createStatement();
                        //SQL statement is injected with the values entered into the appropriate fields.
                        statement.executeUpdate("INSERT INTO Invoice (fkClientID, ServiceDescription, RetailPrice, DiscountAmount, Tax, PaymentType) VALUES ("
                                + tempInvoice.getInvoiceID() + ", '"
                                + tempInvoice.getInvoiceServiceDescription() + "', " + tempInvoice.getInvoiceRetailPrice() + ", "
                                + tempInvoice.getInvoiceDiscount() + ", " + tempInvoice.getInvoiceTax() + ", '"
                                + tempInvoice.getInvoicePaymentType() + "')");
                        invoicePanel.getWarningLabel().setForeground(Color.black);
                        invoicePanel.getWarningLabel().setText("Invoice Added Successfully");
                        connection.close();
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(MainTabbedPane.class.getName()).log(Level.SEVERE, null, ex);
                        ex.printStackTrace();
                        invoicePanel.getWarningLabel().setForeground(Color.RED);
                        invoicePanel.getWarningLabel().setText("ERROR, Please check all fields and try again!");
                    }
                }
            });
            //clientPanel addClientButton is retrieved and fitted with an ActionListener. This will check to make sure all fields are properly completed.
            clientPanel.getAddClientButton().addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {

                    Statement statement;
                    try {
                        if (clientPanel.getClientNameText().getText().equals("Client Name") || clientPanel.getClientCityText().getText().equals("ClientCity")
                                || clientPanel.getClientZipText().getText().equals("Client ZipCode") || clientPanel.getClientStateText().getText().equals("Client State")
                                || clientPanel.getClientAddressText().getText().equals("Client Address") || clientPanel.getClientPhoneText().getText().equals("Client Phone")
                                || clientPanel.getClientFaxText().getText().equals("Client Fax") || clientPanel.getClientEmailText().getText().equals("Client Email")) {
                            clientPanel.getWarningLabel().setForeground(Color.RED);
                            clientPanel.getWarningLabel().setText("ERROR, Please check all fields and try again!");
                        } else {
                            Client tempClient = clientPanel.importClient();
                            statement = connection.createStatement();
                            statement.executeUpdate("INSERT INTO Client (ClientName, BusinessAddress, City, State, ZipCode, PhoneNumber, FaxNumber,"
                                    + " Email, MemberStatus) VALUES ('" + tempClient.getClientName() + "', '"
                                    + tempClient.getClientAddress().getAddressStreet() + "', '" + tempClient.getClientAddress().getAddressCity() + "', '"
                                    + tempClient.getClientAddress().getAddressState() + "', " + tempClient.getClientAddress().getAddressZip() + ", "
                                    + tempClient.getClientPhone() + ", " + tempClient.getClientFax() + ", '" + tempClient.getClientEmail() + "', '"
                                    + tempClient.getClientMemberStatus() + "')");
                            clientPanel.getWarningLabel().setForeground(Color.black);
                            clientPanel.getWarningLabel().setText("Client Added Successfully");
                            connection.close();
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(MainTabbedPane.class.getName()).log(Level.SEVERE, null, ex);
                        ex.printStackTrace();
                        clientPanel.getWarningLabel().setForeground(Color.RED);
                        clientPanel.getWarningLabel().setText("ERROR, Please check all fields and try again!");
                    }
                }
            });

        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
            clientPanel.getWarningLabel().setForeground(Color.RED);
            clientPanel.getWarningLabel().setText("ERROR, Please check all fields and try again!");
        }
    }

}
