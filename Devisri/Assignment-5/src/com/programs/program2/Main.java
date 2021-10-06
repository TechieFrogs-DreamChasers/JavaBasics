package com.programs.program2;

public class Main {
    public static void main(String[] args) {
        BankA a=new BankA();
        System.out.println("BankA getBalance() returns: $"+a.getBalance());
        BankB b=new BankB();
        System.out.println("BankB getBalance() returns: $"+b.getBalance());
        BankC c=new BankC();
        System.out.println("BankC getBalance() returns: $"+c.getBalance());
    }
}
