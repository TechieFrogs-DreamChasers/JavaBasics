package com.obj.practice;

public class BankConAddFunctionality {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address add1 = new Address(25, "Chennai", "TamilNadu", "India", 520147);
        Bank bank1 = new Bank("00000025871586", "John", 50000.0, add1);
        System.out.println("Original: " + bank1);
        Bank bank2 = bank1.clone();
        System.out.println("Replica: " + bank2);
        bank2.acc_Number = "00000085214793";
        bank2.name = "Mary";
        System.out.println("Replica Changes: " + bank2);
        System.out.println(" ");
        Address add2 = new Address(100, "Hyderabad", "Telangana", "India", 500000);
        Consumer con1 = new Consumer(5321, "Dryer", 8524976013L, add2);
        System.out.println("Original: " + con1);
        Consumer con2 = con1.clone();
        System.out.println("Replica: " + con2);
        con2.product_Id = 78521;
        con2.consumer_Phone = 7852014963L;
        con2.address = add1;
        System.out.println("Replica Changes: " + con2);
    }
}
/*
Original: Bank{acc_Number='00000025871586', name='John', balance=50000.0,
address=Address{h_No=25, city='Chennai', state='TamilNadu', country='India', zipCode=520147}}
Replica: Bank{acc_Number='00000025871586', name='John', balance=50000.0,
address=Address{h_No=25, city='Chennai', state='TamilNadu', country='India', zipCode=520147}}
Replica Changes: Bank{acc_Number='00000085214793', name='Mary', balance=50000.0,
address=Address{h_No=25, city='Chennai', state='TamilNadu', country='India', zipCode=520147}}

Original: Consumer{product_Id=5321, product_Name='Dryer', consumer_Phone=8524976013,
address=Address{h_No=100, city='Hyderabad', state='Telangana', country='India', zipCode=500000}}
Replica: Consumer{product_Id=5321, product_Name='Dryer', consumer_Phone=8524976013,
address=Address{h_No=100, city='Hyderabad', state='Telangana', country='India', zipCode=500000}}
Replica Changes: Consumer{product_Id=78521, product_Name='Dryer', consumer_Phone=7852014963,
address=Address{h_No=25, city='Chennai', state='TamilNadu', country='India', zipCode=520147}}

 */