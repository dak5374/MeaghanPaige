/*
 * Last Updated: 0/0/2017
 * Class description:
 */
package View;

import java.util.Date;
import meaghanpaigeinventorysystem.Address;
import meaghanpaigeinventorysystem.Customer;

public class CustomerPanel extends javax.swing.JPanel {
    
    Date today = new Date();

    public CustomerPanel() {

        addCustomerLabel = new javax.swing.JLabel();
        customerNameText = new javax.swing.JTextField();
        customerAddressText = new javax.swing.JTextField();
        customerCityText = new javax.swing.JTextField();
        customerStateText = new javax.swing.JTextField();
        customerZipText = new javax.swing.JTextField();
        customerPhoneText = new javax.swing.JTextField();
        customerFaxText = new javax.swing.JTextField();
        customerEmailText = new javax.swing.JTextField();
        addCustomerButton = new javax.swing.JButton();
        

        addCustomerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addCustomerLabel.setText("Add Customer");
        customerNameText.setText("Customer Name");
        customerAddressText.setText("Customer Street");
        customerCityText.setText("Customer City");
        customerStateText.setText("Customer State");
        customerZipText.setText("Customer ZipCode");
        customerPhoneText.setText("Customer Phone Number");
        customerFaxText.setText("Customer Fax Number");
        customerEmailText.setText("Customer Email");
        addCustomerButton.setText("Add Customer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        
        //Horizontal Group
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addCustomerLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(customerFaxText)
                                                        .addComponent(customerNameText)
                                                        .addComponent(customerCityText)
                                                        .addComponent(customerZipText))
                                                .addGap(160, 160, 160)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(customerAddressText)
                                                        .addComponent(customerStateText)
                                                        .addComponent(customerPhoneText)
                                                        .addComponent(customerEmailText))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(addCustomerButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        //Vertical Group
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(addCustomerLabel)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(customerNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(customerAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(customerCityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(customerStateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(customerZipText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(customerPhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(customerFaxText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(customerEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addCustomerButton)
                                .addContainerGap(25, Short.MAX_VALUE))
        );  
    }
    
    public Customer importCustomer() {
        
        Customer customer = new Customer(customerNameText.getText(), new Address(customerCityText.getText(), customerStateText.getText(), 
                Integer.parseInt(customerZipText.getText()), customerAddressText.getText()), Integer.parseInt(customerPhoneText.getText()), Integer.parseInt(customerFaxText.getText()), 
                customerEmailText.getText(), today, "Active");
        return customer;
    }
    
    private javax.swing.JButton addCustomerButton;
    private javax.swing.JLabel addCustomerLabel;
    private javax.swing.JTextField customerNameText;
    private javax.swing.JTextField customerAddressText;
    private javax.swing.JTextField customerCityText;
    private javax.swing.JTextField customerStateText;
    private javax.swing.JTextField customerZipText;
    private javax.swing.JTextField customerPhoneText;
    private javax.swing.JTextField customerFaxText;
    private javax.swing.JTextField customerEmailText;
    
}
