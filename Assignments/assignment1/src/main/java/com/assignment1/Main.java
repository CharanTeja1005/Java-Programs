package com.assignment1;

import java.io.FileReader;
import java.util.List;
import java.util.logging.Logger;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Main {
    public static Logger logger = Logger.getLogger("App1Logger");

    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("/home/osiuser/Downloads/OSI Training/Nagarjuna Class Tutorials/Assignments/assignment1/src/main/java/com/assignment1/jsonfile/customer.json"));

            JSONArray customers = (JSONArray) jsonObject.get("customers");
            List<Customer> customersList = new ArrayList<>();
            
            for(Object customer : customers) {
                customersList.add(Customer.toCustomer((JSONObject)customer));
            }

            JSONArray deposits = (JSONArray) jsonObject.get("deposits");
            List<Deposit> depositsList = new ArrayList<>();
            
            for(Object deposit : deposits) {
                depositsList.add(Deposit.toDeposit((JSONObject)deposit));
            }

            JSONArray loans = (JSONArray) jsonObject.get("loans");
            List<Loan> loansList = new ArrayList<>();
            
            for(Object loan : loans) {
                loansList.add(Loan.toLoan((JSONObject)loan));
            }

            JSONArray addresses = (JSONArray) jsonObject.get("addresses");
            List<Address> addressesList = new ArrayList<>();
            
            for(Object address : addresses) {
                addressesList.add(Address.toAddress((JSONObject)address));
            }

            JSONArray departments = (JSONArray) jsonObject.get("departments");
            List<Department> departmentsList = new ArrayList<>();
            
            for(Object department : departments) {
                departmentsList.add(Department.toDepartment((JSONObject)department));
            }

            JSONArray locations = (JSONArray) jsonObject.get("locations");
            List<Location> locationsList = new ArrayList<>();
            
            for(Object location : locations) {
                locationsList.add(Location.toLocation((JSONObject)location));
            }

            Bank bank = new Bank(customersList, depositsList, loansList, addressesList, departmentsList, locationsList);
            System.out.println(bank);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}