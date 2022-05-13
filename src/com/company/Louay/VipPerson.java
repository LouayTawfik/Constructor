package com.company.Louay;

public class VipPerson {
    public String name;
    public double creditLimit;
    public String emailAddress;

    public VipPerson() {
        this("tim", 5000.0, "tim@mymail.com");
    }

    public VipPerson(String name, double creditLimit) {
        this(name, creditLimit, "unknown@mymail.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public VipPerson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
}
