package com.assignment1;

import org.json.simple.JSONObject;

public class Address {
    private String addressId, street, city, state, zipCode, country;

    public Address(String addressId, String street, String city, String state, String zipCode, String country) {
        this.addressId = addressId;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", state=" + state
                + ", zipCode=" + zipCode + ", country=" + country + "]";
    }

    public static Address toAddress(JSONObject jsonObject) {
        String addressId = (String) jsonObject.get("addressId");
        String street = (String) jsonObject.get("street");
        String city = (String) jsonObject.get("city");
        String state = (String) jsonObject.get("state");
        String zipCode = (String) jsonObject.get("zipCode");
        String country = (String) jsonObject.get("country");

        return new Address(addressId, street, city, state, zipCode, country);
    }
}
