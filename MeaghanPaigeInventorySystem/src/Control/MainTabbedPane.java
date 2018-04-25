/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import View.ImportPanel;
import View.InventoryPanel;
import View.WelcomePanel;
import View.ClientPanel;
import View.CustomerPanel;
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

public class MainTabbedPane extends JFrame {

    WelcomePanel wp;

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    WelcomePanel welcomePanel = new WelcomePanel();
    ImportPanel importPanel = new ImportPanel();
    InventoryPanel inventoryPanel = new InventoryPanel();
    ClientPanel clientPanel = new ClientPanel();
    CustomerPanel customerPanel = new CustomerPanel();

    JTabbedPane mainTabbedPane = new JTabbedPane();

    public MainTabbedPane() {

        mainTabbedPane.add("Welcome Panel", welcomePanel);
        mainTabbedPane.add("Import Panel", importPanel);
        mainTabbedPane.add("Inventory Panel", inventoryPanel);
        mainTabbedPane.add("Client Panel", clientPanel);
        mainTabbedPane.add("Customer Panel", customerPanel);

        add(mainTabbedPane);

        try {

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (ClassNotFoundException cnfex) {

            System.out.println("Problem in loading or "
                    + "registering MS Access JDBC driver");
            cnfex.printStackTrace();
        }

        try {

            String msAccDB = "IST440MeaghanPaige.accdb";
            String dbURL = "jdbc:ucanaccess://src/meaghanpaigeinventorysystem/" + msAccDB;
            connection = DriverManager.getConnection(dbURL);
            clientPanel.getAddClientButton().addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {

                    Statement statement;
                    try {
                        Client tempClient = clientPanel.importClient();
                        statement = connection.createStatement();
                        statement.executeUpdate("INSERT INTO Client (ClientName, BusinessAddress, City, State, ZipCode, PhoneNumber, FaxNumber,"
                                + " Email, MemberStatus) VALUES ('" + tempClient.getClientName() + "', '"
                                + tempClient.getClientAddress().getAddressStreet() + "', '" + tempClient.getClientAddress().getAddressCity() + "', '"
                                + tempClient.getClientAddress().getAddressState() + "', " + tempClient.getClientAddress().getAddressZip() + ", "
                                + tempClient.getClientPhone() + ", " + tempClient.getClientFax() + ", '" + tempClient.getClientEmail() + "', '"
                                + tempClient.getClientMemberStatus() + "')");

                    } catch (SQLException ex) {
                        Logger.getLogger(MainTabbedPane.class.getName()).log(Level.SEVERE, null, ex);
                        ex.printStackTrace();
                    }
                }
            });

        } catch (SQLException sqlex) {
            System.out.println("line 67");
            sqlex.printStackTrace();

        }
    }

}
