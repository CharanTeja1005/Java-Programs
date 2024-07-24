package com.assignment1;

import java.util.List;

public class Bank {
    private List<Customer> customers;
    private List<Deposit> deposits;
    private List<Loan> loans;
    private List<Address> addresses;
    private List<Department> departments;
    private List<Location> locations;
    
    public Bank(List<Customer> customers, List<Deposit> deposits, List<Loan> loans, List<Address> addresses,
            List<Department> departments, List<Location> locations) {
        this.customers = customers;
        this.deposits = deposits;
        this.loans = loans;
        this.addresses = addresses;
        this.departments = departments;
        this.locations = locations;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Deposit> getDeposits() {
        return deposits;
    }

    public void setDeposits(List<Deposit> deposits) {
        this.deposits = deposits;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Bank [customers=" + customers + ", deposits=" + deposits + ", loans=" + loans + ", addresses="
                + addresses + ", departments=" + departments + ", locations=" + locations + "]";
    }
}
