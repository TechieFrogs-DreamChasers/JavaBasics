package com.obj.practice;

public class OrderMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address();
        address.setH_No(15);
        address.setCity("Madras");
        address.setState("TamilNadu");
        address.setCountry("India");
        address.setZipCode(532145);
        Order order = new Order();
        order.setOrder_Id(85247);
        order.setOrder_Name("Book");
        order.setOrder_Type("Cash-On-Delivery");
        order.setOrder_Delivery_Due_Days(10);
        //Dependency Injection using Setters & Getters
        order.setAddress(address);
        System.out.println(order);
        System.out.println(" ");
        Address add = (Address) address.clone();
        add.h_No = 28;
        add.city = "Chennai";
        //Dependency Injection using Constructor
        OrderViaConstructor ovc = new OrderViaConstructor(623581, "HeadPhones",
                "NetBanking", 6, add);
        System.out.println(ovc);
    }
}
/*
85247	Book	Cash-On-Delivery	10
15	Madras	TamilNadu	India	532145

623581	HeadPhones	NetBanking	6
28	Chennai	TamilNadu	India	532145
 */