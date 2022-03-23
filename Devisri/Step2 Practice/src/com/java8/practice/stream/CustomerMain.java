package com.java8.practice.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerMain {
    public static void main(String[] args) {

        List<Customer> customerList_1 = new ArrayList<>();
        customerList_1.add(new Customer(1001,"Aruna"));
        customerList_1.add(new Customer(1002,"Barun"));
        customerList_1.add(new Customer(1003,"Charini"));
        customerList_1.add(new Customer(1004,"Devi"));
        customerList_1.add(new Customer(1005,"Eeshwar"));

        List<Customer> customerList_2 = new ArrayList<>();
        customerList_2.add(new Customer(2001,"Fathima"));
        customerList_2.add(new Customer(2002,"Geetha"));
        customerList_2.add(new Customer(2003,"Harsha"));
        customerList_2.add(new Customer(2004,"Indhira"));
        customerList_2.add(new Customer(2005,"Jay"));

        List<Customer> customerList_3 = new ArrayList<>();
        customerList_3.add(new Customer(3001,"Krishna"));
        customerList_3.add(new Customer(3002,"Leela"));
        customerList_3.add(new Customer(3003,"Madhu"));
        customerList_3.add(new Customer(3004,"Neela"));
        customerList_3.add(new Customer(3005,"Omaar"));

        List<Customer> customerList = new ArrayList<>();
        customerList.addAll(customerList_1);
        customerList.addAll(customerList_2);
        customerList.addAll(customerList_3);
        //One-One mapping
        List<Integer> customer_Ids = customerList.stream().map(e->e.getCustomer_Id()).collect(Collectors.toList());
        System.out.println(customer_Ids);
        List<String> customer_Names = customerList.stream().map(e->e.getCustomer_Name()).collect(Collectors.toList());
        System.out.println(customer_Names);
    }
}
