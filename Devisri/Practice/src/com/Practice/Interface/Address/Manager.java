package com.Practice.Interface.Address;

public class Manager extends Person{
    private String name;
    private int age;
    private double salary;
    private char gender;

    public Manager(String name, int age, double salary, char gender) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }
    public void display(){
        System.out.println(name+" "+age+" "+gender+" "+salary);
    }

    @Override
    public void haveHouse() {
        System.out.println("Manager has no own house!!!");
        super.haveHouse();
    }

    @Override
    public void haveCar() {
        System.out.println("Manager has no own Car!!!");
        super.haveCar();
    }

    @Override
    public String showContinent() {
        return "Asia";
    }

    @Override
    public String showCountry() {
        return "India";
    }

    @Override
    public String showState() {
        return "Telangana";
    }

    @Override
    public String showCity() {
        return "Hyderabad";
    }

    @Override
    public void isEmployed() {
        System.out.println("Employed as Manager!!!");
        super.isEmployed();
    }
}
