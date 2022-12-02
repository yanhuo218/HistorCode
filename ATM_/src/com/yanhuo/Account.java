package com.yanhuo;

public class Account {
    private String CardNumber;
    private String Name;
    private Double remainingSum;
    private Double limit;
    private String password;

    public Account() {

    }

    public Account(String cardNumber, String name, Double remainingSum, Double limit, String password) {
        CardNumber = cardNumber;
        Name = name;
        this.remainingSum = remainingSum;
        this.limit = limit;
        this.password = password;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(String cardNumber) {
        CardNumber = cardNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getRemainingSum() {
        return remainingSum;
    }

    public void setRemainingSum(Double remainingSum) {
        this.remainingSum = remainingSum;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
