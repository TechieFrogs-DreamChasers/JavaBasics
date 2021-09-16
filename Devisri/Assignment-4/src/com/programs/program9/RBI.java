package com.programs.program9;

public class RBI {
    static final double MIN_INTEREST_RATE=4;
    static final double MAX_INTEREST_RATE=9;
    static final double MIN_BALANCE=500.0D;
    static final double MAX_WITHDRAWAL=100000.0D;

    public double getInterestRate() {
        return MIN_INTEREST_RATE;
    }
    public double getWithdrawalLimit() {
        return MAX_WITHDRAWAL;
    }
    public double getMaxInterestRate(){
        return MAX_INTEREST_RATE;
    }
    public double getMinBalance(){
        return MIN_BALANCE;
    }
}
