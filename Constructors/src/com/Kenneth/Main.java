package com.Kenneth;

public class Main {

    public static void main(String[] args) {
        bankAccount bobsAccount = new bankAccount();
        bobsAccount.withdrawFromAccount(100.00);

        bobsAccount.depositToAccount(50.00);
        bobsAccount.withdrawFromAccount(100.00);

        bobsAccount.depositToAccount(51.00);
        bobsAccount.withdrawFromAccount(100.00);

        bankAccount timsbankAccount = new bankAccount(2134, 500, "Tim", "tim@email.com", "12345");
        System.out.println(timsbankAccount.getAccountNumber() + " name " + timsbankAccount.getcustomerName());


        VipCustomer timsVipCustomer = new VipCustomer("Tim", 1000, "tim@email.com");
        System.out.println(timsVipCustomer.getCustomerName() + " name " + timsVipCustomer.getCreditLimit());







    }
}
