package com.programs.program6;

public class Main {
    public static void main(String[] args) {
        BankA a = new BankA();
        System.out.println("Tom deposited an amount of $" + a.getBalance() + " in this bank.");
        BankB b = new BankB();
        System.out.println("Tom deposited an amount of $" + b.getBalance() + " in this bank.");
        BankC c = new BankC();
        System.out.println("Tom deposited an amount of $" + c.getBalance() + " in this bank.");
    }
}
