package com.Practice.Inheritance.Person;

public class Person {
    String name;
    int age;
    int id;
    long phone;
    char gender;

    public Person() {
        this("John", 17, 1234, 75315496L, 'm');
        System.out.println("Parent Class-->Person-->Person()");
    }

    public Person(String name, int age, int id, long phone, char gender) {
        System.out.println("Parent Class-->Person-->Person(parameters)");
        this.name = name;
        this.age = age;
        this.id = id;
        this.phone = phone;
        this.gender = gender;
    }

    void display() {
        System.out.println("Parent Class-->Person-->display()");
        System.out.println(name + "  " + age + "  " + id + "  " + phone + "  " + gender);
    }
}
