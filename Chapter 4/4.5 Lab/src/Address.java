public class Address {
    private String street, city, state;
    private int zipCode;
    public Address(String street, String city, String state, int zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    public String getStreet() {
        return street;
    }
    public Address setStreet(String street) {
        String temp = this.street;
        this.street = street;
        Address output = this;
        //this.street = temp;
        return output;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public int getZipCode() {
        return zipCode;
    }
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    @Override
    public String toString() {
        return street + "\n" + city + ", " + state + ", " + zipCode;
    }
}
