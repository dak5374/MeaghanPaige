/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.MainTabbedPane;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import meaghanpaigeinventorysystem.Invoice;

/**
 *
 * @author usmck
 */
public class InvoicePanel extends javax.swing.JPanel {

    /**
     * Creates new form ImportPanel
     * @throws java.io.IOException
     */
    public InvoicePanel() {        
        initComponents();
    }
    
    

    private void initComponents() {

        Connection connection;
        Statement statement;
        ResultSet resultSet;
//        ArrayList<String> clientArray = new ArrayList();
        setInvoiceLabel(new javax.swing.JLabel());
        setSourceComboBox(new javax.swing.JComboBox<>());
        setClientComboBox(new javax.swing.JComboBox<>());
        setServiceDescText(new javax.swing.JTextField());
        setRetailPriceText(new javax.swing.JTextField());
        setDiscountText(new javax.swing.JTextField());
        setTaxText(new javax.swing.JTextField());
        setPaymentComboBox(new javax.swing.JComboBox<>());
        setWarningLabel(new javax.swing.JLabel());
        setCreateInvoiceButton(new javax.swing.JButton());

        getClientComboBox().setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Client"}));

        try {
            String msAccDB = "IST440MeaghanPaige.accdb";
            String dbURL = "jdbc:ucanaccess://src/meaghanpaigeinventorysystem/" + msAccDB;
            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT ClientName FROM Client");
            while (resultSet.next()) {
                String set = resultSet.getString("ClientName");
                getClientComboBox().addItem(set);
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainTabbedPane.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            System.out.println("error");
        }

        getInvoiceLabel().setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getInvoiceLabel().setText("Add Invoice");

        getSourceComboBox().setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Manual", "PayPal", "SquareSpace"}));

        getServiceDescText().setText("Service Description");
        getServiceDescText().addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                if (getServiceDescText().getText().equals("Service Description")) {
                    getServiceDescText().setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (getServiceDescText().getText().equals("")) {
                    getServiceDescText().setText("Service Description");
                }
            }
        });

        getRetailPriceText().setText("Retail Price");
        getRetailPriceText().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textKeyTyped(evt);
            }
        });
        getRetailPriceText().addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                if (getRetailPriceText().getText().equals("Retail Price")) {
                    getRetailPriceText().setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (getRetailPriceText().getText().equals("")) {
                    getRetailPriceText().setText("Retail Price");
                }
            }
        });

        getDiscountText().setText("Discount");
        getDiscountText().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textKeyTyped(evt);
            }
        });
        getDiscountText().addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                if (getDiscountText().getText().equals("Discount")) {
                    getDiscountText().setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (getDiscountText().getText().equals("")) {
                    getDiscountText().setText("Discount");
                }
            }
        });

        getTaxText().setText("Tax (%)");
        getTaxText().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textKeyTyped(evt);
            }
        });
        getTaxText().addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                if (getTaxText().getText().equals("Tax (%)")) {
                    getTaxText().setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (getTaxText().getText().equals("")) {
                    getTaxText().setText("Tax (%)");
                }
            }
        });
        getPaymentComboBox().setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Payment Type", "Cash", "Debit/Credit", "On Account"}));

        getCreateInvoiceButton().setText("Create Invoice");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(170, 170, 170)
                                                        .addComponent(getInvoiceLabel()))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(getSourceComboBox(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 168, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(getClientComboBox(), javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(getDiscountText(), javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(getServiceDescText(), javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(getPaymentComboBox(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(getWarningLabel(), javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(getTaxText())
                                                        .addComponent(getRetailPriceText())))))
                        .addContainerGap())
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 150, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(getCreateInvoiceButton())
                                .addComponent(invoiceLabel))
                        .addGap(163, 163, 163))
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(getInvoiceLabel())
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getSourceComboBox(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(getClientComboBox(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(getServiceDescText(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(getRetailPriceText(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(getDiscountText(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(getTaxText(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(paymentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(getWarningLabel(), javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getCreateInvoiceButton())
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }

    public Invoice importInvoice() {
        int tempID = 0;
        try {
            String msAccDB = "IST440MeaghanPaige.accdb";
            String dbURL = "jdbc:ucanaccess://src/meaghanpaigeinventorysystem/" + msAccDB;
            Connection connection = DriverManager.getConnection(dbURL);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT ClientID FROM Client WHERE ClientName = '" + getClientComboBox().getSelectedItem().toString() + "'");
            while (resultSet.next()) {
                String set = resultSet.getString("ClientID");
                tempID = Integer.parseInt(set);
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainTabbedPane.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            System.out.println("error");
        }
        Double tempDouble = Double.parseDouble(getTaxText().getText()) / 100;
        Invoice invoice = new Invoice(tempID, getServiceDescText().getText(), Double.parseDouble(getRetailPriceText().getText()), Double.parseDouble(getDiscountText().getText()), tempDouble, getPaymentComboBox().getSelectedItem().toString());
        return invoice;
    }

    private void textKeyTyped(java.awt.event.KeyEvent evt) {
        char vchar = evt.getKeyChar();
        if (Character.isLetter(vchar)&& !evt.isAltDown())
                {
            evt.consume();
        }
    }

    /**
     * @return the clientComboBox
     */
    public javax.swing.JComboBox<String> getClientComboBox() {
        return clientComboBox;
    }

    /**
     * @param clientComboBox the clientComboBox to set
     */
    public void setClientComboBox(javax.swing.JComboBox<String> clientComboBox) {
        this.clientComboBox = clientComboBox;
    }

    /**
     * @return the discountText
     */
    public javax.swing.JTextField getDiscountText() {
        return discountText;
    }

    /**
     * @param discountText the discountText to set
     */
    public void setDiscountText(javax.swing.JTextField discountText) {
        this.discountText = discountText;
    }

    /**
     * @return the invoiceLabel
     */
    public javax.swing.JLabel getInvoiceLabel() {
        return invoiceLabel;
    }

    /**
     * @param invoiceLabel the invoiceLabel to set
     */
    public void setInvoiceLabel(javax.swing.JLabel invoiceLabel) {
        this.invoiceLabel = invoiceLabel;
    }

    /**
     * @return the paymentComboBox
     */
    public javax.swing.JComboBox<String> getPaymentComboBox() {
        return paymentComboBox;
    }

    /**
     * @param paymentComboBox the paymentComboBox to set
     */
    public void setPaymentComboBox(javax.swing.JComboBox<String> paymentComboBox) {
        this.paymentComboBox = paymentComboBox;
    }

    /**
     * @return the retailPriceText
     */
    public javax.swing.JTextField getRetailPriceText() {
        return retailPriceText;
    }

    /**
     * @param retailPriceText the retailPriceText to set
     */
    public void setRetailPriceText(javax.swing.JTextField retailPriceText) {
        this.retailPriceText = retailPriceText;
    }

    /**
     * @return the serviceDescText
     */
    public javax.swing.JTextField getServiceDescText() {
        return serviceDescText;
    }

    /**
     * @param serviceDescText the serviceDescText to set
     */
    public void setServiceDescText(javax.swing.JTextField serviceDescText) {
        this.serviceDescText = serviceDescText;
    }

    /**
     * @return the sourceComboBox
     */
    public javax.swing.JComboBox<String> getSourceComboBox() {
        return sourceComboBox;
    }

    /**
     * @param sourceComboBox the sourceComboBox to set
     */
    public void setSourceComboBox(javax.swing.JComboBox<String> sourceComboBox) {
        this.sourceComboBox = sourceComboBox;
    }

    /**
     * @return the taxText
     */
    public javax.swing.JTextField getTaxText() {
        return taxText;
    }

    /**
     * @param taxText the taxText to set
     */
    public void setTaxText(javax.swing.JTextField taxText) {
        this.taxText = taxText;
    }

    /**
     * @return the createInvoiceButton
     */
    public javax.swing.JButton getCreateInvoiceButton() {
        return createInvoiceButton;
    }

    /**
     * @param createInvoiceButton the createInvoiceButton to set
     */
    public void setCreateInvoiceButton(javax.swing.JButton createInvoiceButton) {
        this.createInvoiceButton = createInvoiceButton;
    }

    /**
     * @return the warningLabel
     */
    public javax.swing.JLabel getWarningLabel() {
        return warningLabel;
    }

    /**
     * @param warningLabel the warningLabel to set
     */
    public void setWarningLabel(javax.swing.JLabel warningLabel) {
        this.warningLabel = warningLabel;
    }

    private javax.swing.JComboBox<String> clientComboBox;
    private javax.swing.JTextField discountText;
    private javax.swing.JLabel invoiceLabel;
    private javax.swing.JComboBox<String> paymentComboBox;
    private javax.swing.JTextField retailPriceText;
    private javax.swing.JTextField serviceDescText;
    private javax.swing.JComboBox<String> sourceComboBox;
    private javax.swing.JTextField taxText;
    private javax.swing.JLabel warningLabel;
    private javax.swing.JButton createInvoiceButton;
    // End of variables declaration                   
}
