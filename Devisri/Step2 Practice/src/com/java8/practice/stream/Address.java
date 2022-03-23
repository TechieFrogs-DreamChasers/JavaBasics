package com.java8.practice.stream;

public class Address {
    private int batch_No;
    private String locality;
    private String state;

    public Address(int batch_No, String locality, String state) {
        this.batch_No = batch_No;
        this.locality = locality;
        this.state = state;
    }

    public int getH_No() {
        return batch_No;
    }

    public void setH_No(int batch_No) {
        this.batch_No = batch_No;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return getH_No()+", "+getLocality()+", "+getState();
    }
}
