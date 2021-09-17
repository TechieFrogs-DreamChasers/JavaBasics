package com.programs.program3;

public class Member {
    private String name;
    private int age;
    private long phone_Number;
    private String address;
    private double salary;

    public Member(String name, int age, long phone_Number, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phone_Number = phone_Number;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getPhone_Number() {
        return phone_Number;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}
