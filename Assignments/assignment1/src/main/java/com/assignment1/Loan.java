package com.assignment1;

import org.json.simple.JSONObject;

public class Loan {
    private String loadId, customerId, startDate, endDate, status;
    private double amount, interestRate;

    public Loan(String loadId, String customerId, String startDate, String endDate, String status, double amount,
            double interestRate) {
        this.loadId = loadId;
        this.customerId = customerId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.amount = amount;
        this.interestRate = interestRate;
    }

    public String getLoadId() {
        return loadId;
    }

    public void setLoadId(String loadId) {
        this.loadId = loadId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "Loan [loadId=" + loadId + ", customerId=" + customerId + ", startDate=" + startDate + ", endDate="
                + endDate + ", status=" + status + ", amount=" + amount + ", interestRate=" + interestRate + "]";
    }

    public static Loan toLoan(JSONObject jsonObject) {
        String loanId = (String) jsonObject.get("depositId");
        String customerId = (String) jsonObject.get("customerId");
        double amount = (double) jsonObject.get("amount");
        String startDate = (String) jsonObject.get("startDate");
        String endDate = (String) jsonObject.get("endDate");
        double interestRate = (double) jsonObject.get("interestRate");
        String status = (String) jsonObject.get("status");

        return new Loan(loanId, customerId, startDate, endDate, status, amount, interestRate);
    }
}
