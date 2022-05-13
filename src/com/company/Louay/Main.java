package com.company.Louay;

public class Main {

    public static void main(String[] args) {
//        Account bobsAccount = new Account();
//
//        System.out.println(bobsAccount.getNumber());
//        System.out.println(bobsAccount.getBalance());
//
//
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(51.0);
//        bobsAccount.withdrawal(100.0);
//
//        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
//        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());

        VipPerson p1 = new VipPerson();
        System.out.println(p1.getName());
        System.out.println(p1.getCreditLimit());
        System.out.println(p1.getEmailAddress());
        System.out.println("================================");

        VipPerson p2 = new VipPerson("Unknown", 2000.0);
        System.out.println(p2.getName());
        System.out.println(p2.getCreditLimit());
        System.out.println(p2.getEmailAddress());
        System.out.println("=================================");

        VipPerson p3 = new VipPerson("John", 7000.0, "john@mymail.com");
        System.out.println(p3.getName());
        System.out.println(p3.getCreditLimit());
        System.out.println(p3.getEmailAddress());
    }
}
