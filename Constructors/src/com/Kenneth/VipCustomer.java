package com.Kenneth;

/**
 * Created by Kenneth on 5/25/2016.
 */
public class VipCustomer {
    private String customerName;
    private double creditLimit;
    private String email;


    public VipCustomer() {
        this("Default name", 1000, "Default email");

        System.out.println("Empty constructor called");
    }
    public VipCustomer(String customerName, double creditLimit, String email) {
        System.out.println("Account constructor with parameters called");
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer(String customerName, double creditLimit) {
        this(customerName, creditLimit, "Default email");
        }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
