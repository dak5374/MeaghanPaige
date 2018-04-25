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
        addClientButton = new javax.swing.JButton();
        warningLabel = new javax.swing.JLabel();

        addClientLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addClientLabel.setText("Add Client");

        clientNameText.setText("Client Name");
        clientNameText.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                if (clientNameText.getText().equals("Client Name")) {
                    clientNameText.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (clientNameText.getText().equals("")) {
                    clientNameText.setText("Client Name");
                }
            }
        });

        clientAddressText.setText("Client Address");
        clientAddressText.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                if (clientAddressText.getText().equals("Client Address")) {
                    clientAddressText.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (clientAddressText.getText().equals("")) {
                    clientAddressText.setText("Client Address");
                }
            }
        });

        clientCityText.setText("Client City");
        clientCityText.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                if (clientCityText.getText().equals("Client City")) {
                    clientCityText.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (clientCityText.getText().equals("")) {
                    clientCityText.setText("Client City");
                }
            }
        });

        clientStateText.setText("Client State");
        clientStateText.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                if (clientStateText.getText().equals("Client State")) {
                    clientStateText.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (clientStateText.getText().equals("")) {
                    clientStateText.setText("Client State");
                }
            }
        });

        clientZipText.setText("Client ZipCode");
        clientZipText.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                if (clientZipText.getText().equals("Client ZipCode")) {
                    clientZipText.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (clientZipText.getText().equals("")) {
                    clientZipText.setText("Client ZipCode");
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
                if (clientPhoneText.getText().equals("Client Phone")) {
                    clientPhoneText.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (clientPhoneText.getText().equals("")) {
                    clientPhoneText.setText("Client Phone");
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
                if (clientFaxText.getText().equals("Client Fax")) {
                    clientFaxText.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (clientFaxText.getText().equals("")) {
                    clientFaxText.setText("Client Fax");
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
                if (clientEmailText.getText().equals("Client Email")) {
                    clientEmailText.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (clientEmailText.getText().equals("")) {
                    clientEmailText.setText("Client Email");
                }
            }
        });
        addClientButton.setText("Add Client");

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
      //  if ()
        Client client = new Client(clientNameText.getText(), new Address(clientCityText.getText(), clientStateText.getText(),
                Long.parseLong(clientZipText.getText()), clientAddressText.getText()), Long.parseLong(clientPhoneText.getText()), Long.parseLong(clientFaxText.getText()),
                clientEmailText.getText(), "Active");
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
