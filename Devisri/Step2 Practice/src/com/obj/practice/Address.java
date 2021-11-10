package com.obj.practice;
//Independent Class
public class Address {
    int h_No;
    String city;
    String state;
    String country;
    long zipCode;

    public Address(int h_No, String city, String state, String country, long zipCode) {
        this.h_No = h_No;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "h_No=" + h_No +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
