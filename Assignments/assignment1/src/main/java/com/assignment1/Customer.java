package com.assignment1;

import org.json.simple.JSONObject;

public class Customer {
    private String customerId, name, email, phone;
    private Address address;
    
    public Customer(String customerId, String name, String email, String phone, Address address) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    

    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", name=" + name + ", email=" + email + ", phone=" + phone
                + ", address=" + address + "]";
    }

    public static Customer toCustomer(JSONObject jsonObject) {
        String  customerId = (String) jsonObject.get("customerId");
        String  name = (String) jsonObject.get("name");
        String  email = (String) jsonObject.get("email");
        String  phone = (String) jsonObject.get("phone");
        Address address = Address.toAddress((JSONObject) jsonObject.get("address"));

        return new Customer(customerId, name, email, phone, address);
    }
}
