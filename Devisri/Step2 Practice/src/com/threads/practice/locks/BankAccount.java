package com.threads.practice.locks;

public class BankAccount {
    int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(int amount) throws InterruptedException {
            if(amount > this.balance){
                wait();
                System.out.println("Balance before withdrawal: "+balance);
                balance-=amount;
                System.out.println("Balance after withdrawal: "+balance);
            }
    }
    public synchronized void deposit(int amount){
            System.out.println("Balance before deposit: "+balance);
            balance+=amount;
            System.out.println("Balance after deposit: "+balance);
            notify();
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount(50000);
        Thread t1 = new Thread(()->{
            try {
                ba.withdraw(60000);
            } catch (InterruptedException e) {
                System.err.println("Insufficient Funds");
            }
        });
        Thread t2 = new Thread(()->{
            ba.deposit(100000);
        });
        t1.start();
        t2.start();
    }
}
