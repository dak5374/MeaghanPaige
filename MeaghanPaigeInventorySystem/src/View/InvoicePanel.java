/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import meaghanpaigeinventorysystem.Invoice;
/**
 *
 * @author usmck
 */
public class InvoicePanel extends javax.swing.JPanel {

    /**
     * Creates new form ImportPanel
     */
    public InvoicePanel() {
        initComponents();
    }

    private void initComponents() {

        setInvoiceLabel(new javax.swing.JLabel());
        setSourceComboBox(new javax.swing.JComboBox<>());
        setClientComboBox(new javax.swing.JComboBox<>());
        setCustomerComboBox(new javax.swing.JComboBox<>());
        setServiceDescText(new javax.swing.JTextField());
        setRetailPriceText(new javax.swing.JTextField());
        setDiscountText(new javax.swing.JTextField());
        setTaxText(new javax.swing.JTextField());
        setPaymentComboBox(new javax.swing.JComboBox<>());
        warningLabel = new javax.swing.JLabel();

        getInvoiceLabel().setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getInvoiceLabel().setText("Add Invoice");

        getSourceComboBox().setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manual", "PayPal", "SquareSpace" }));

        getClientComboBox().setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Client", "Item 2", "Item 3", "Item 4" }));

        getCustomerComboBox().setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Item 2", "Item 3", "Item 4" }));

        getServiceDescText().setText("Service Description");

        getRetailPriceText().setText("Retail Price");

        getDiscountText().setText("Discount");

        getTaxText().setText("Tax (%)");

        getPaymentComboBox().setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Payment Type", "Item 2", "Item 3", "Item 4" }));

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
                            .addComponent(warningLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(getTaxText())
                                .addComponent(getCustomerComboBox(), 0, 140, Short.MAX_VALUE)
                                .addComponent(getRetailPriceText())))))
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(getInvoiceLabel())
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getSourceComboBox(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getClientComboBox(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getCustomerComboBox(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(getPaymentComboBox(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }
    
    public Invoice importInvoice() {
        Invoice invoice = new Invoice(getClientComboBox().getSelectedItem().toString(), getServiceDescText().getText(), Double.parseDouble(getDiscountText().getText()), Integer.parseInt(getTaxText().getText()), getPaymentComboBox().getSelectedItem().toString());
        return invoice;
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
     * @return the customerComboBox
     */
    public javax.swing.JComboBox<String> getCustomerComboBox() {
        return customerComboBox;
    }

    /**
     * @param customerComboBox the customerComboBox to set
     */
    public void setCustomerComboBox(javax.swing.JComboBox<String> customerComboBox) {
        this.customerComboBox = customerComboBox;
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
    
    private javax.swing.JComboBox<String> clientComboBox;
    private javax.swing.JComboBox<String> customerComboBox;
    private javax.swing.JTextField discountText;
    private javax.swing.JLabel invoiceLabel;
    private javax.swing.JComboBox<String> paymentComboBox;
    private javax.swing.JTextField retailPriceText;
    private javax.swing.JTextField serviceDescText;
    private javax.swing.JComboBox<String> sourceComboBox;
    private javax.swing.JTextField taxText;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration                   
}