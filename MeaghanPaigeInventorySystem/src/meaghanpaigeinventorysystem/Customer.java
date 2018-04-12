package meaghanpaigeinventorysystem;

public class Customer {
    
    //Global variables
    private int customerID;
    private String customerName;
    private int customerPhone;
    private String customerEmail;
    
    //Constructor
    void Customer(int id, String name, int phone, String email){
        this.setCustomerID(id);
        this.setCustomerName(name);
        this.setCustomerPhone(phone);
        this.setCustomerEmail(email);        
    }

    /**
     * @return the customerID
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the customerPhone
     */
    public int getCustomerPhone() {
        return customerPhone;
    }

    /**
     * @param customerPhone the customerPhone to set
     */
    public void setCustomerPhone(int customerPhone) {
        this.customerPhone = customerPhone;
    }

    /**
     * @return the customerEmail
     */
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * @param customerEmail the customerEmail to set
     */
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
 
}//End Class
