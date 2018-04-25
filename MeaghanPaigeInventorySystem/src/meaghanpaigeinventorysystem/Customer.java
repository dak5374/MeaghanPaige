package meaghanpaigeinventorysystem;

import java.util.Date;

public class Customer {
    
    //Global variables
    private String customerName;
    private int customerPhone;
    private int customerFax;
    private String customertEmail;
    private Date customerMembershipDate;
    private String customerMemberStatus;
    private String customerAddress;
    
    //Constructor
    public Customer(String name, String address, int phone, int fax, 
            String email, Date membershipDate, String membershipStatus){
        this.setCustomerName(name);
        this.setCustomerAddress(address);
        this.setCustomerPhone(phone);
        this.setCustomerFax(fax);
        this.setCustomerEmail(email);
        this.setCustomerMembershipDate(membershipDate);
        this.setCustomerMemberStatus(membershipStatus);      
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
     * @return the customerFax
     */
    public int getCustomerFax() {
        return customerFax;
    }

    /**
     * @param customerFax the customerFax to set
     */
    public void setCustomerFax(int customerFax) {
        this.customerFax = customerFax;
    }

    /**
     * @return the customertEmail
     */
    public String getCustomertEmail() {
        return customertEmail;
    }

    /**
     * @param customertEmail the customertEmail to set
     */
    public void setCustomerEmail(String customertEmail) {
        this.customertEmail = customertEmail;
    }

    /**
     * @return the customerMembershipDate
     */
    public Date getCustomerMembershipDate() {
        return customerMembershipDate;
    }

    /**
     * @param customerMembershipDate the customerMembershipDate to set
     */
    public void setCustomerMembershipDate(Date customerMembershipDate) {
        this.customerMembershipDate = customerMembershipDate;
    }

    /**
     * @return the customerMemberStatus
     */
    public String getCustomerMemberStatus() {
        return customerMemberStatus;
    }

    /**
     * @param customerMemberStatus the customerMemberStatus to set
     */
    public void setCustomerMemberStatus(String customerMemberStatus) {
        this.customerMemberStatus = customerMemberStatus;
    }

    /**
     * @return the customerAddress
     */
    public String getCustomerAddress() {
        return customerAddress;
    }

    /**
     * @param customerAddress the customerAddress to set
     */
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
 
}//End Class
