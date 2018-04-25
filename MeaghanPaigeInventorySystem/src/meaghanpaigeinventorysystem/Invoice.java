package meaghanpaigeinventorysystem;

import java.util.Date;

public class Invoice {
    
    //Global variables
    private int invoiceID;
    private String invoiceClientName;
    private String invoiceServiceDescription;
    private double invoiceDiscount;
    private int invoiceTax;
    private String invoicePaymentType;
    
    //Constructor
    public Invoice (String name, String description, double discount,
                int tax, String paymentType){

        this.setInvoiceClientName(name);
        this.setInvoiceServiceDescription(description);
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
    public void setInvoiceTax(int invoiceTax) {
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
}
