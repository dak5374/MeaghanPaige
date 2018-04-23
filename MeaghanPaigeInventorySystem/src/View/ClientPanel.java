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
public class ClientPanel extends javax.swing.JPanel {

    public ClientPanel() {

        lblAddClient = new javax.swing.JLabel();
        tboxClientName = new javax.swing.JTextField();
        tboxClientAddress = new javax.swing.JTextField();
        tboxClientCity = new javax.swing.JTextField();
        tboxClientState = new javax.swing.JTextField();
        tboxClientZip = new javax.swing.JTextField();
        tboxClientPhone = new javax.swing.JTextField();
        tboxClientFax = new javax.swing.JTextField();
        tboxClientEmail = new javax.swing.JTextField();
        btnAddClient = new javax.swing.JButton();
        

        lblAddClient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddClient.setText("Add Client");

        tboxClientName.setText("Client Name");

        tboxClientAddress.setText("Client Address");

        tboxClientCity.setText("Client City");

        tboxClientState.setText("Client State");

        tboxClientZip.setText("Client ZipCode");

        tboxClientPhone.setText("Client Phone Number");

        tboxClientFax.setText("Client Fax Number");

        tboxClientEmail.setText("Client Email");

        btnAddClient.setText("Add Client");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblAddClient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(tboxClientFax)
                                                        .addComponent(tboxClientName)
                                                        .addComponent(tboxClientCity)
                                                        .addComponent(tboxClientZip))
                                                .addGap(160, 160, 160)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(tboxClientAddress)
                                                        .addComponent(tboxClientState)
                                                        .addComponent(tboxClientPhone)
                                                        .addComponent(tboxClientEmail))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(btnAddClient)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblAddClient)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tboxClientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tboxClientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tboxClientCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tboxClientState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tboxClientZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tboxClientPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tboxClientFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tboxClientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddClient)
                                .addContainerGap(25, Short.MAX_VALUE))
        );
    }
    
    private javax.swing.JButton btnAddClient;
    private javax.swing.JLabel lblAddClient;
    private javax.swing.JTextField tboxClientName;
    private javax.swing.JTextField tboxClientAddress;
    private javax.swing.JTextField tboxClientCity;
    private javax.swing.JTextField tboxClientState;
    private javax.swing.JTextField tboxClientZip;
    private javax.swing.JTextField tboxClientPhone;
    private javax.swing.JTextField tboxClientFax;
    private javax.swing.JTextField tboxClientEmail;
}
