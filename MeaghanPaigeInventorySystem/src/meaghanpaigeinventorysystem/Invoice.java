package meaghanpaigeinventorysystem;

import java.util.Date;

public class Invoice {
    
    //Global variables
    private int invoiceID;
    private String invoiceClientName;
    private String invoiceServiceDescription;
    private double invoiceDiscount;
    private double invoiceTax;
    private String invoicePaymentType;
    private double invoiceRetailPrice;
    
    //Constructor
    public Invoice (int iD, String description, double retailPrice, double discount,
                double tax, String paymentType){

        this.setInvoiceID(iD);
        this.setInvoiceServiceDescription(description);
        this.setInvoiceRetailPrice(retailPrice);
        this.setInvoiceDiscount(discount);
        this.setInvoiceTax(tax);
        this.setInvoicePaymentType(paymentType);
    }

    /**
     * @return the invoiceID
     */
    public int getInvoiceID() {
        return invoiceID;
    }

    /**
     * @param invoiceID the invoiceID to set
     */
    public void setInvoiceID(int invoiceID) {
        this.invoiceID = invoiceID;
    }

    /**
     * @return the invoiceClientName
     */
    public String getInvoiceClientName() {
        return invoiceClientName;
    }

    /**
     * @param invoiceClientName the invoiceClientName to set
     */
    public void setInvoiceClientName(String invoiceClientName) {
        this.invoiceClientName = invoiceClientName;
    }

    /**
     * @return the invoiceServiceDescription
     */
    public String getInvoiceServiceDescription() {
        return invoiceServiceDescription;
    }

    /**
     * @param invoiceServiceDescription the invoiceServiceDescription to set
     */
    public void setInvoiceServiceDescription(String invoiceServiceDescription) {
        this.invoiceServiceDescription = invoiceServiceDescription;
    }

    /**
     * @return the invoiceDiscount
     */
    public double getInvoiceDiscount() {
        return invoiceDiscount;
    }

    /**
     * @param invoiceDiscount the invoiceDiscount to set
     */
    public void setInvoiceDiscount(double invoiceDiscount) {
        this.invoiceDiscount = invoiceDiscount;
    }

    /**
     * @return the invoiceTax
     */
    public double getInvoiceTax() {
        return invoiceTax;
    }

    /**
     * @param invoiceTax the invoiceTax to set
     */
    public void setInvoiceTax(double invoiceTax) {
        this.invoiceTax = invoiceTax;
    }

    /**
     * @return the invoicePaymentType
     */
    public String getInvoicePaymentType() {
        return invoicePaymentType;
    }

    /**
     * @param invoicePaymentType the invoicePaymentType to set
     */
    public void setInvoicePaymentType(String invoicePaymentType) {
        this.invoicePaymentType = invoicePaymentType;
    }

    /**
     * @return the invoiceRetailPrice
     */
    public double getInvoiceRetailPrice() {
        return invoiceRetailPrice;
    }

    /**
     * @param invoiceRetailPrice the invoiceRetailPrice to set
     */
    public void setInvoiceRetailPrice(double invoiceRetailPrice) {
        this.invoiceRetailPrice = invoiceRetailPrice;
    }
}
