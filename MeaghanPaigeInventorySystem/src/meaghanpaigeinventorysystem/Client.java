package meaghanpaigeinventorysystem;

import java.util.Date;

public class Client {
    
    //Global variables
    private int clientID;
    private String clientName;
    private int clientPhone;
    private int clientFax;
    private String clientEmail;
    private Date clientMembershipDate;
    private String clientMemberStatus;
    
    //Constructor
    void Client(int id, String name, int phone, int fax, String email, 
                Date membershipDate, String membershipStatus)
    {
        this.setClientID(id);
        this.setClientName(name);
        this.setClientPhone(phone);
        this.setClientFax(fax);
        this.setClientEmail(email);
        this.setClientMembershipDate(membershipDate);
        this.setClientMemberStatus(membershipStatus);
    }

    /**
     * @return the clientID
     */
    public int getClientID() {
        return clientID;
    }

    /**
     * @param clientID the clientID to set
     */
    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    /**
     * @return the clientName
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * @param clientName the clientName to set
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * @return the clientPhone
     */
    public int getClientPhone() {
        return clientPhone;
    }

    /**
     * @param clientPhone the clientPhone to set
     */
    public void setClientPhone(int clientPhone) {
        this.clientPhone = clientPhone;
    }

    /**
     * @return the clientFax
     */
    public int getClientFax() {
        return clientFax;
    }

    /**
     * @param clientFax the clientFax to set
     */
    public void setClientFax(int clientFax) {
        this.clientFax = clientFax;
    }

    /**
     * @return the clientEmail
     */
    public String getClientEmail() {
        return clientEmail;
    }

    /**
     * @param clientEmail the clientEmail to set
     */
    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    /**
     * @return the clientMembershipDate
     */
    public Date getClientMembershipDate() {
        return clientMembershipDate;
    }

    /**
     * @param clientMembershipDate the clientMembershipDate to set
     */
    public void setClientMembershipDate(Date clientMembershipDate) {
        this.clientMembershipDate = clientMembershipDate;
    }

    /**
     * @return the clientMemberStatus
     */
    public String getClientMemberStatus() {
        return clientMemberStatus;
    }

    /**
     * @param clientMemberStatus the clientMemberStatus to set
     */
    public void setClientMemberStatus(String clientMemberStatus) {
        this.clientMemberStatus = clientMemberStatus;
    } 
    
}//End class
