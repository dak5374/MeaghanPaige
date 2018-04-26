/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author usmck
 */
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import meaghanpaigeinventorysystem.Client;
import java.util.Date;
import meaghanpaigeinventorysystem.Address;

public class ClientPanel extends javax.swing.JPanel {

    Date today = new Date();

    public ClientPanel() {

        addClientLabel = new javax.swing.JLabel();
        clientNameText = new javax.swing.JTextField();
        clientAddressText = new javax.swing.JTextField();
        clientCityText = new javax.swing.JTextField();
        clientStateText = new javax.swing.JTextField();
        clientZipText = new javax.swing.JTextField();
        clientPhoneText = new javax.swing.JTextField();
        clientFaxText = new javax.swing.JTextField();
        clientEmailText = new javax.swing.JTextField();
        addClientButton = new javax.swing.JButton("Add Client");
        warningLabel = new javax.swing.JLabel();

        addClientLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addClientLabel.setText("Add Client");

        clientNameText.setText("Client Name");
        clientNameText.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                if (getClientNameText().getText().equals("Client Name")) {
                    getClientNameText().setText("");
                }
            } 

            @Override
            public void focusLost(FocusEvent fe) {
                if (getClientNameText().getText().equals("")) {
                    getClientNameText().setText("Client Name");
                }
            }
        });

        clientAddressText.setText("Client Address");
        clientAddressText.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                if (getClientAddressText().getText().equals("Client Address")) {
                    getClientAddressText().setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (getClientAddressText().getText().equals("")) {
                    getClientAddressText().setText("Client Address");
                }
            }
        });

        clientCityText.setText("Client City");
        clientCityText.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                if (getClientCityText().getText().equals("Client City")) {
                    getClientCityText().setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (getClientCityText().getText().equals("")) {
                    getClientCityText().setText("Client City");
                }
            }
        });

        clientStateText.setText("Client State");
        clientStateText.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                if (getClientStateText().getText().equals("Client State")) {
                    getClientStateText().setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (getClientStateText().getText().equals("")) {
                    getClientStateText().setText("Client State");
                }
            }
        });

        clientZipText.setText("Client ZipCode");
        clientZipText.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                if (getClientZipText().getText().equals("Client ZipCode")) {
                    getClientZipText().setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (getClientZipText().getText().equals("")) {
                    getClientZipText().setText("Client ZipCode");
                }
            }
        });
        clientZipText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textKeyTyped(evt);
            }
        });
        
        clientPhoneText.setText("Client Phone");
        clientPhoneText.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                if (getClientPhoneText().getText().equals("Client Phone")) {
                    getClientPhoneText().setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (getClientPhoneText().getText().equals("")) {
                    getClientPhoneText().setText("Client Phone");
                }
            }
        });
        clientPhoneText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textKeyTyped(evt);
            }
        });
        
        clientFaxText.setText("Client Fax");
        clientFaxText.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                if (getClientFaxText().getText().equals("Client Fax")) {
                    getClientFaxText().setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (getClientFaxText().getText().equals("")) {
                    getClientFaxText().setText("Client Fax");
                }
            }
        });
        clientFaxText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textKeyTyped(evt);
            }
        });
        
        clientEmailText.setText("Client Email");
        clientEmailText.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                if (getClientEmailText().getText().equals("Client Email")) {
                    getClientEmailText().setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (getClientEmailText().getText().equals("")) {
                    getClientEmailText().setText("Client Email");
                }
            }
        });

        warningLabel.setText("Please Complete All Fields");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addClientLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(clientFaxText)
                                                        .addComponent(clientNameText)
                                                        .addComponent(clientCityText)
                                                        .addComponent(clientZipText)
                                                        .addComponent(warningLabel))
                                                .addGap(160, 160, 160)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(clientAddressText)
                                                        .addComponent(clientStateText)
                                                        .addComponent(clientPhoneText)
                                                        .addComponent(clientEmailText)
                                                        .addComponent(addClientLabel))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(addClientButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(addClientLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(clientNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(clientAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(clientCityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(clientStateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(clientZipText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(clientPhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(clientFaxText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(clientEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addClientButton)
                                .addContainerGap(25, Short.MAX_VALUE))
        );
    }

    public Client importClient() {

        Client client = new Client(getClientNameText().getText(), new Address(getClientCityText().getText(), getClientStateText().getText(),
                Long.parseLong(getClientZipText().getText()), getClientAddressText().getText()), Long.parseLong(getClientPhoneText().getText()), 
                Long.parseLong(getClientFaxText().getText()), getClientEmailText().getText(), "Active");
        return client;

    }

    private void textKeyTyped(java.awt.event.KeyEvent evt) {
        char vchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar))
                || (vchar == KeyEvent.VK_BACK_SPACE)
                || (vchar == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }
    
    public javax.swing.JLabel getWarningLabel() {
        return warningLabel;
    }
//    private void 
    public javax.swing.JButton getAddClientButton() {
        return addClientButton;
    }

    /**
     * @return the clientNameText
     */
    public javax.swing.JTextField getClientNameText() {
        return clientNameText;
    }

    /**
     * @param clientNameText the clientNameText to set
     */
    public void setClientNameText(javax.swing.JTextField clientNameText) {
        this.clientNameText = clientNameText;
    }

    /**
     * @return the clientAddressText
     */
    public javax.swing.JTextField getClientAddressText() {
        return clientAddressText;
    }

    /**
     * @param clientAddressText the clientAddressText to set
     */
    public void setClientAddressText(javax.swing.JTextField clientAddressText) {
        this.clientAddressText = clientAddressText;
    }

    /**
     * @return the clientCityText
     */
    public javax.swing.JTextField getClientCityText() {
        return clientCityText;
    }

    /**
     * @param clientCityText the clientCityText to set
     */
    public void setClientCityText(javax.swing.JTextField clientCityText) {
        this.clientCityText = clientCityText;
    }

    /**
     * @return the clientStateText
     */
    public javax.swing.JTextField getClientStateText() {
        return clientStateText;
    }

    /**
     * @param clientStateText the clientStateText to set
     */
    public void setClientStateText(javax.swing.JTextField clientStateText) {
        this.clientStateText = clientStateText;
    }

    /**
     * @return the clientZipText
     */
    public javax.swing.JTextField getClientZipText() {
        return clientZipText;
    }

    /**
     * @param clientZipText the clientZipText to set
     */
    public void setClientZipText(javax.swing.JTextField clientZipText) {
        this.clientZipText = clientZipText;
    }

    /**
     * @return the clientPhoneText
     */
    public javax.swing.JTextField getClientPhoneText() {
        return clientPhoneText;
    }

    /**
     * @param clientPhoneText the clientPhoneText to set
     */
    public void setClientPhoneText(javax.swing.JTextField clientPhoneText) {
        this.clientPhoneText = clientPhoneText;
    }

    /**
     * @return the clientFaxText
     */
    public javax.swing.JTextField getClientFaxText() {
        return clientFaxText;
    }

    /**
     * @param clientFaxText the clientFaxText to set
     */
    public void setClientFaxText(javax.swing.JTextField clientFaxText) {
        this.clientFaxText = clientFaxText;
    }

    /**
     * @return the clientEmailText
     */
    public javax.swing.JTextField getClientEmailText() {
        return clientEmailText;
    }

    /**
     * @param clientEmailText the clientEmailText to set
     */
    public void setClientEmailText(javax.swing.JTextField clientEmailText) {
        this.clientEmailText = clientEmailText;
    }
    private final javax.swing.JButton addClientButton;
    private final javax.swing.JLabel addClientLabel;
    private javax.swing.JTextField clientNameText;
    private javax.swing.JTextField clientAddressText;
    private javax.swing.JTextField clientCityText;
    private javax.swing.JTextField clientStateText;
    private javax.swing.JTextField clientZipText;
    private javax.swing.JTextField clientPhoneText;
    private javax.swing.JTextField clientFaxText;
    private javax.swing.JTextField clientEmailText;
    private javax.swing.JLabel warningLabel;
}
