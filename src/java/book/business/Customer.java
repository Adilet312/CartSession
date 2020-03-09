/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.business;
import java.io.Serializable;

/**
 *
 * @author amt
 */
public class Customer implements Serializable {
    private Long customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String country;
    
    public Customer()
    {
         this.firstName = "";
        this.lastName = "";
        this.email =  "";
        this.address =  "";
        this.city = "";
        this.state =  "";
        this.zip =  "";
        this.country =  "";
        
        
    }

    public Customer(String firstName,String lastName, String email, String address, String city, String state,String zip, String country )
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email =  email;
        this.address =  address;
        this.city =  city;
        this.state =  state;
        this.zip =  zip;
        this.country =  country;
        
    }
    public Long getCustomerId() 
    {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(Long customerId) 
    {
        this.customerId = customerId;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the sate
     */
    public String getState() {
        return state;
    }

    /**
     * @param sate the sate to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }
    public String toString()
    {
        String output = "Customer { "+
                        "  First name: " + this.firstName + 
                        ", Last name: " + this.lastName +
                        ", Email: " + this.email + 
                        ", Address: " + this.address +
                        ", City: " + this.city + 
                        ", State: " + this.state + 
                        ", Zip: " + this.zip +
                        ", Country: " + this.country +
                         " }";
        return output;
    }

    /**
     * @return the customerId
     */

    
}
