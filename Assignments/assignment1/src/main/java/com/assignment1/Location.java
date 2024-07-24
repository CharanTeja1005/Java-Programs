package com.assignment1;

import org.json.simple.JSONObject;

public class Location {
    private String locationId, name;
    private Address address;

    public Location(String locationId, String name, Address address) {
        this.locationId = locationId;
        this.name = name;
        this.address = address;
    }
    
    public String getLocationId() {
        return locationId;
    }
    
    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Address getAddress() {
        return address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Location [locationId=" + locationId + ", name=" + name + ", address=" + address + "]";
    }

    public static Location toLocation(JSONObject jsonObject) {
        String locationId = (String) jsonObject.get("locationId");
        String name = (String) jsonObject.get("name");
        Address address = Address.toAddress((JSONObject) jsonObject.get("address"));

        return new Location(locationId, name, address);
    }
}
