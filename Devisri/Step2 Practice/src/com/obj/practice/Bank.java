package com.obj.practice;
//Target class
public class Bank implements Cloneable{
    String acc_Number;
    String name;
    double balance;
    Address address;

    public Bank(String acc_Number, String name, double balance, Address address) {
        this.acc_Number = acc_Number;
        this.name = name;
        this.balance = balance;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "acc_Number='" + acc_Number + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", address=" + address +
                '}';
    }

    @Override
    public Bank clone() throws CloneNotSupportedException {
        return (Bank) super.clone();
    }
}
