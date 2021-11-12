package com.singleton.practice;

public class BankingMain {
    public static void main(String[] args) {
        Banking banking = BankingUtility.createObject();
        Banking online_banking = BankingUtility.createObject();
        //Setting Values for both references
        online_banking.setBank_Branch("Sub");
        online_banking.setAcc_Type("Checking");
        online_banking.setLoan_Type("Car");

        banking.setBank_Branch("Main");
        banking.setAcc_Type("Savings");
        banking.setLoan_Type("Home");

        //Checking whether singleton is achieved or not

        System.out.println(banking.hashCode() == online_banking.hashCode());
        System.out.println(banking);
        System.out.println(online_banking);

    }
}
/*
true
Savings	Home	Main
Savings	Home	Main
 */