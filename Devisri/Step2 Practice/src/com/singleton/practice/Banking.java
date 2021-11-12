package com.singleton.practice;

public class Banking {
    private String acc_Type;
    private String loan_Type;
    private String bank_Branch;

    //Trying to achieve singleton

    public String getAcc_Type() {
        return acc_Type;
    }

    public void setAcc_Type(String acc_Type) {
        this.acc_Type = acc_Type;
    }

    public String getLoan_Type() {
        return loan_Type;
    }

    public void setLoan_Type(String loan_Type) {
        this.loan_Type = loan_Type;
    }

    public String getBank_Branch() {
        return bank_Branch;
    }

    public void setBank_Branch(String bank_Branch) {
        this.bank_Branch = bank_Branch;
    }

    @Override
    public String toString() {
        return getAcc_Type() + "\t" + getLoan_Type() + "\t" + getBank_Branch();
    }
}
