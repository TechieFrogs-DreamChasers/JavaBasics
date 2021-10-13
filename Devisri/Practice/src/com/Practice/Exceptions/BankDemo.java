package com.Practice.Exceptions;

class CheckingAccount {
    private double balance;
    private int acc_Num;

    public CheckingAccount(int acc_Num) {
        this.acc_Num = acc_Num;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double sum_Amount) throws InsufficientFunds {
        if (sum_Amount <= balance) {
            balance -= sum_Amount;
        } else {
            double counter = sum_Amount - balance;
            throw new InsufficientFunds(counter);
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAcc_Num() {
        return acc_Num;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount(1001);
        System.out.println("Depositing 5000....");
        ca.deposit(5000);
        try {
            System.out.println("Withdrawal of 2000....");
            ca.withdraw(2000);
            System.out.println("Withdrawal of 4000....");
            ca.withdraw(4000);
        } catch (InsufficientFunds i) {
            System.out.println("Your Balance is short of: " + i.getAmount());
            i.printStackTrace();
        }
    }
}

class InsufficientFunds extends Exception {
    private double amount;

    public InsufficientFunds(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
/*
Depositing 5000....
Withdrawal of 2000....
Withdrawal of 4000....
Your Balance is short of: 1000.0
com.Practice.Exceptions.InsufficientFunds
	at com.Practice.Exceptions.CheckingAccount.withdraw(BankDemo.java:17)
	at com.Practice.Exceptions.BankDemo.main(BankDemo.java:38)
 */