package com.programs.program4;

public abstract class Person {
    public Person() {
        System.out.println("This is an abstract class Person()");
    }
    public abstract void a_Method();
    public void display(){
        System.out.println("This is a normal method of abstract class Person");
    }
}
