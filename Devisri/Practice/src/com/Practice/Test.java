package com.Practice;
/*
        Output:
        Static Block-->Parent class-->Test
        Static Block-->Child class-->Test1
        Instance Block-->Parent class-->Test
        Parent class-->Test-->Test()
        Instance Block-->Child class-->Test1
        Child class-->Test1-->Test1(parameters)
        1234  29  Tom
     */

class Test1 extends Test {
    int id;
    int age;
    String name;

    public Test1(int id, int age, String name) {
        System.out.println("Child class-->Test1-->Test1(parameters)");
        this.id = id;
        this.age = age;
        this.name = name;
    }

    {
        System.out.println("Instance Block-->Child class-->Test1");
    }

    static {
        System.out.println("Static Block-->Child class-->Test1");
    }

    void display() {
        System.out.println(id + "  " + age + "  " + name);
    }
}

public class Test {
    static void sum(short a,short b){
        System.out.println(a + b);
    }
    public Test() {
        System.out.println("Parent class-->Test-->Test()");
    }

    {
        System.out.println("Instance Block-->Parent class-->Test");
    }

    static {
        System.out.println("Static Block-->Parent class-->Test");
    }

    public static void main(String[] args) {
        Test1 test = new Test1(1234, 29, "Tom");
        test.display();
    }

}
