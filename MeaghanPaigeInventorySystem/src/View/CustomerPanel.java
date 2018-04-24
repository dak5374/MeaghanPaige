/*
 * Last Updated: 0/0/2017
 * Class description:
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerPanel extends javax.swing.JPanel {

    public CustomerPanel() {

        lblAddCustomer = new javax.swing.JLabel();
        tboxCustomerName = new javax.swing.JTextField();
        tboxCustomerAddress = new javax.swing.JTextField();
        tboxCustomerCity = new javax.swing.JTextField();
        tboxCustomerState = new javax.swing.JTextField();
        tboxCustomerZip = new javax.swing.JTextField();
        tboxCustomerPhone = new javax.swing.JTextField();
        tboxCustomerFax = new javax.swing.JTextField();
        tboxCustomerEmail = new javax.swing.JTextField();
        btnAddCustomer = new javax.swing.JButton();
        

        lblAddCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddCustomer.setText("Add Customer");
        tboxCustomerName.setText("Customer Name");
        tboxCustomerAddress.setText("Customer Address");
        tboxCustomerCity.setText("Customer City");
        tboxCustomerState.setText("Customer State");
        tboxCustomerZip.setText("Customer ZipCode");
        tboxCustomerPhone.setText("Customer Phone Number");
        tboxCustomerFax.setText("Customer Fax Number");
        tboxCustomerEmail.setText("Customer Email");
        btnAddCustomer.setText("Add Customer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblAddCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(tboxCustomerFax)
                                                        .addComponent(tboxCustomerName)
                                                        .addComponent(tboxCustomerCity)
                                                        .addComponent(tboxCustomerZip))
                                                .addGap(160, 160, 160)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(tboxCustomerAddress)
                                                        .addComponent(tboxCustomerState)
                                                        .addComponent(tboxCustomerPhone)
                                                        .addComponent(tboxCustomerEmail))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(btnAddCustomer)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblAddCustomer)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tboxCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tboxCustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tboxCustomerCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tboxCustomerState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tboxCustomerZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tboxCustomerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tboxCustomerFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tboxCustomerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddCustomer)
                                .addContainerGap(25, Short.MAX_VALUE))
        );
        
        //Event handler
        btnAddCustomer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                //Create Customer object
                //Customer customer = new Customer(Customer arguments here, here, here, and here);
                
                //Create Address object
                //Address address = new Address(Address arguments here, here, here, and here);
                
                //Ask database to accept the object arguments as input to store respectively 
                
                /* 
                If we create the customer object using the Customer ID, we can also assign the address an address ID 
                so we can link the two objects together
                
                Did you want to do that or create customer and client objects with 
                addresses as part of their arguments? If that is the case, we would need to 
                restructure the data layer objects and completely do away with the address object and class
                */
        }
            });
        
    }
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JLabel lblAddCustomer;
    private javax.swing.JTextField tboxCustomerName;
    private javax.swing.JTextField tboxCustomerAddress;
    private javax.swing.JTextField tboxCustomerCity;
    private javax.swing.JTextField tboxCustomerState;
    private javax.swing.JTextField tboxCustomerZip;
    private javax.swing.JTextField tboxCustomerPhone;
    private javax.swing.JTextField tboxCustomerFax;
    private javax.swing.JTextField tboxCustomerEmail;
    
}
