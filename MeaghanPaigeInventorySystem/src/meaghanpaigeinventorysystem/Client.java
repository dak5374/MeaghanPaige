package meaghanpaigeinventorysystem;

public class Client {

    //Global variables
    private String clientName;
    private long clientPhone;
    private long clientFax;
    private String clientEmail;
    private String clientMemberStatus;
    private Address clientAddress;

    


    //Constructor
    public Client(String name, Address address,
            long phone, long fax, String email,
            /*Date membershipDate,*/ String membershipStatus) {

        this.setClientName(name);
        this.setClientAddress(address);
        this.setClientPhone(phone);
        this.setClientFax(fax);
        this.setClientEmail(email);
        this.setClientMemberStatus(membershipStatus);

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
     * @return the clientAddress
     */
    public Address getClientAddress() {
        return clientAddress;
    }

    /**
     * @param clientAddress the clientAddress to set
     */
    public void setClientAddress(Address clientAddress) {
        this.clientAddress = clientAddress;
    }

    /**
     * @return the clientPhone
     */
    public long getClientPhone() {
        return clientPhone;
    }

    /**
     * @param clientPhone the clientPhone to set
     */
    public void setClientPhone(long clientPhone) {
        this.clientPhone = clientPhone;
    }

    /**
     * @return the clientFax
     */
    public long getClientFax() {
        return clientFax;
    }

    /**
     * @param clientFax the clientFax to set
     */
    public void setClientFax(long clientFax) {
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
