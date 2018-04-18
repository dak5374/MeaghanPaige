package meaghanpaigeinventorysystem;

public class Address {
    
    //Global variables
    private String addressCity;
    private String addressState;
    private int addressZip;
    private String addressStreet;
    
    //Constructor
    void Address(String city, String state, int zip, String street){
        this.setAddressCity(city);
        this.setAddressState(state);
        this.setAddressZip(zip);
        this.setAddressStreet(street);
    }

    /**
     * @return the addressCity
     */
    public String getAddressCity() {
        return addressCity;
    }

    /**
     * @param addressCity the addressCity to set
     */
    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    /**
     * @return the addressState
     */
    public String getAddressState() {
        return addressState;
    }

    /**
     * @param addressState the addressState to set
     */
    public void setAddressState(String addressState) {
        this.addressState = addressState;
    }

    /**
     * @return the addressZip
     */
    public int getAddressZip() {
        return addressZip;
    }

    /**
     * @param addressZip the addressZip to set
     */
    public void setAddressZip(int addressZip) {
        this.addressZip = addressZip;
    }

    /**
     * @return the addressStreet
     */
    public String getAddressStreet() {
        return addressStreet;
    }

    /**
     * @param addressStreet the addressStreet to set
     */
    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }
    
}//End class
