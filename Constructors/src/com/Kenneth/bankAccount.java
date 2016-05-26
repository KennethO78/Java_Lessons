package com.Kenneth;

/**
 * Created by Kenneth on 5/24/2016.
 */
public class bankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    /*public bankAccount(String customerName, String email, String phoneNumber) {
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }*/

    public bankAccount() {
        this(56789, 2.50, "Default name", "Default address", "Default phone");

        System.out.println("Empty constructor called");
    }
    public bankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setbalance(double balance){
        this.balance = balance;
    }

    public double getbalance() {
        return this.balance;
    }

    public void setcustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getcustomerName() {
        return this.customerName;
    }

    public void setemail (String email){
        this.email = email;
    }

    public String getemail() {
        return this.email;
    }

    public void setphoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getphoneNumber() {
        return this.phoneNumber;

    }

    public void depositToAccount (double balance) {
        double newAmount = this.balance + balance;
        setbalance(newAmount);
        System.out.println(this.balance);

    }

    public void withdrawFromAccount (double balanceWithdraw) {
        if( balanceWithdraw > this.balance) {
            System.out.println("Insufficient funds");
        }else {
            double newAmount = this.balance - balanceWithdraw;
            setbalance(newAmount);
            System.out.println(this.balance);
        }
    }
}