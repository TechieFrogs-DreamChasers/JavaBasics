package com.obj.practice;
//Dependency Injection via setters
public class Order {
    private int order_Id;
    private String order_Name;
    private String order_Type;
    private int order_Delivery_Due_Days;
    Address address;

    public int getOrder_Id() {
        return order_Id;
    }

    public void setOrder_Id(int order_Id) {
        this.order_Id = order_Id;
    }

    public String getOrder_Name() {
        return order_Name;
    }

    public void setOrder_Name(String order_Name) {
        this.order_Name = order_Name;
    }

    public String getOrder_Type() {
        return order_Type;
    }

    public void setOrder_Type(String order_Type) {
        this.order_Type = order_Type;
    }

    public int getOrder_Delivery_Due_Days() {
        return order_Delivery_Due_Days;
    }

    public void setOrder_Delivery_Due_Days(int order_Delivery_Due_Days) {
        this.order_Delivery_Due_Days = order_Delivery_Due_Days;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return getOrder_Id()+"\t"+getOrder_Name()+"\t"+getOrder_Type()+"\t"+
                getOrder_Delivery_Due_Days()+"\n"+getAddress();
    }
}
