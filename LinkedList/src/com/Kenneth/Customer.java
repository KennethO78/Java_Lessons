package com.Kenneth;

/**
 * Created by Kenneth on 5/31/2016.
 */
public class Customer {

    private String name;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance){ this.balance = balance; }
}
