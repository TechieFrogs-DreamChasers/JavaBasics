package com.singleton.practice;

public class BankingUtility {
    //passing class variable as null
    private static Banking bank = null;
    //Using private constructor here also
    private BankingUtility() {
    }
    //factory method which returns class as its return-type
    public static Banking createObject() {
        if (bank == null) {
            bank = new Banking();
        }
        return bank;
    }
}
