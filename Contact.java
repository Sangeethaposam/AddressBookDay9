package com.bridzelabz.addressBook;

public class Contact {
	private String firstname ;
    private String lastName;
    private String address;
    private String  city ;
    private String state;
    private String contactNumber;
    private String zip;
    private String gmail ;
    public Contact(String name, String surName, String Address, String  city, String state, String contactNumber,
                   String zip, String gmail){
        this.firstname = name;
        this.lastName = surName;
        this.address = Address;
        this.city=city;
        this.state = state;
        this.contactNumber = contactNumber;
        this.zip = zip;
        this.gmail = gmail;
    }

    public Contact() {
    }

    public String getName() {
        return firstname;
    }

    public void setName(String name) {
        this.firstname = name;
    }

    public String getSurName() {
        return lastName;
    }

    public void setSurName(String surName) {
        this.lastName = surName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
    public String toStore(){
        return String.format(firstname+" "+ lastName+ " "+ address+" "  +city+" " + state+" "+ contactNumber+
                " "+ zip+" "+ gmail);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", zip='" + zip + '\'' +
                ", gmail='" + gmail + '\'' +
                '}';
    }
}
