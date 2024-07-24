package com.assignment1;

import org.json.simple.JSONObject;

public class Deposit {
    private String depositId, customerId, date, type;
    private double amount;

    public Deposit(String depositId, String customerId, String date, String type, double amount) {
        this.depositId = depositId;
        this.customerId = customerId;
        this.date = date;
        this.type = type;
        this.amount = amount;
    }

    public String getDepositId() {
        return depositId;
    }

    public void setDepositId(String depositId) {
        this.depositId = depositId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Deposit [depositId=" + depositId + ", customerId=" + customerId + ", date=" + date + ", type=" + type
                + ", amount=" + amount + "]";
    }

    public static Deposit toDeposit(JSONObject jsonObject) {
        String depositId = (String) jsonObject.get("depositId");
        String customerId = (String) jsonObject.get("customerId");
        double amount = (double) jsonObject.get("amount");
        String date = (String) jsonObject.get("date");
        String type = (String) jsonObject.get("type");

        return new Deposit(depositId, customerId, date, type, amount);
    }
}
