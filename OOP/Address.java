package OOP;

// A base template like structure for storing addresses
public class Address {
    private String countryName;
    private String stateName;

    // Setter
    public void setCountryName(String country){
        this.countryName = country;
    }

    public void setStateName(String state){
        this.stateName = state;
    }

    // Getters
    public String getCountryName(){
        return this.countryName;
    }

    public String getStateName(){
        return this.stateName;
    }
}
