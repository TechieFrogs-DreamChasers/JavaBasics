package com.obj.practice;
//Independent Class
public class Address implements Cloneable{
    int h_No;
    String city;
    String state;
    String country;
    long zipCode;

    public Address() {
    }

    public Address(int h_No, String city, String state, String country, long zipCode) {
        this.h_No = h_No;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }

    public int getH_No() {
        return h_No;
    }

    public void setH_No(int h_No) {
        this.h_No = h_No;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return getH_No()+"\t"+getCity()+"\t"+getState()+"\t"+
                getCountry()+"\t"+getZipCode();
    }
    public  Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
