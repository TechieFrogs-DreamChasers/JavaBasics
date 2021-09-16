package com.programs.program4;

public class Student {
    private String name;
    private int age;
    private String address;

    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Not Available";
    }

    public void setInfo(String name, int age) {
        System.out.println(name + " || " + age);
    }

    public void setInfo(String name, int age, String address) {
        System.out.println(name + " | " + age + " | " + address);
    }
}
