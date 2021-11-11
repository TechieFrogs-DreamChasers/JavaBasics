package com.obj.practice;

public class PersonMain {
    public static void main(String[] args) {
        Address address = new Address(15, "Hyderabad", "Telangana", "India", 500000);
        //Dependency Injection using Constructor
        Person person = new Person("Meghan", 30, "meg@email.com", 5286391475L, address);
        System.out.println(person);
        System.out.println(" ");
        address.setH_No(50);
        address.setCity("Mumbai");
        address.setState("Maharashtra");
        address.setCountry("India");
        address.setZipCode(523892);
        //Dependency Injection using setters
        person.setAddress(address);
        System.out.println(person);
    }
}
/*
Meghan	30	meg@email.com	5286391475
15	Hyderabad	Telangana	India	500000

Meghan	30	meg@email.com	5286391475
50	Mumbai	Maharashtra	India	523892
 */