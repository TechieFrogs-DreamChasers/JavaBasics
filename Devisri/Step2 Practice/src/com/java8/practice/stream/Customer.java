package com.java8.practice.stream;

import java.util.List;

public class Customer {
    private int customer_Id;
    private String customer_Name;


    public Customer(int customer_Id, String customer_Name) {
        this.customer_Id = customer_Id;
        this.customer_Name = customer_Name;

    }

    public int getCustomer_Id() {
        return customer_Id;
    }

    public void setCustomer_Id(int customer_Id) {
        this.customer_Id = customer_Id;
    }

    public String getCustomer_Name() {
        return customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        this.customer_Name = customer_Name;
    }

    @Override
    public String toString() {
        return "Customer: [ "+ getCustomer_Id() +"\t"+getCustomer_Name()+" ]";
    }
}
