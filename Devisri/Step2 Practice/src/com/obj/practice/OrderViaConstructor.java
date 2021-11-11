package com.obj.practice;

public class OrderViaConstructor {
    private int order_Id;
    private String order_Name;
    private String order_Type;
    private int order_Delivery_Due_Days;
    Address address;

    public OrderViaConstructor(int order_Id, String order_Name, String order_Type, int order_Delivery_Due_Days, Address address) {
        this.order_Id = order_Id;
        this.order_Name = order_Name;
        this.order_Type = order_Type;
        this.order_Delivery_Due_Days = order_Delivery_Due_Days;
        this.address = address;
    }

    public int getOrder_Id() {
        return order_Id;
    }

    public String getOrder_Name() {
        return order_Name;
    }

    public String getOrder_Type() {
        return order_Type;
    }

    public int getOrder_Delivery_Due_Days() {
        return order_Delivery_Due_Days;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return getOrder_Id()+"\t"+getOrder_Name()+"\t"+getOrder_Type()+"\t"+
                getOrder_Delivery_Due_Days()+"\n"+getAddress();
    }
}
