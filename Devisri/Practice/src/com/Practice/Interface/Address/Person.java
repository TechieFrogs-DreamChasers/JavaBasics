package com.Practice.Interface.Address;

public class Person implements Address,Description{
    @Override
    public String showContinent() {
       return " ";
    }

    @Override
    public String showCountry() {
        return " ";
    }

    @Override
    public String showState() {
        return " ";
    }

    @Override
    public String showCity() {
        return " ";
    }
    void show_Address(){
        System.out.println("Address: "+showCity()+" " +showState()+" " +showCountry()+" "+showContinent());
    }

    @Override
    public void haveHouse() {
        System.out.println("Person Does not own a house!!!");
    }

    @Override
    public void haveCar() {
        System.out.println("Person Does not own a car!!!");
    }

    @Override
    public void isEmployed() {
        System.out.println("Person Employed!!!");
    }
    
}
