package com.Practice.Interface.RulesFeatures;
/*
Two keywords are used abstract & class
Can have final, non-final,static,non-static variables
An abstract class can have both abstract and non-abstract (concrete)methods.
can have main method
can have constructor
 */
//abstract class extending an interface=may or may not implement/override methods of interface
public abstract class AModelA implements ModelA {

    private int a;
    protected int b;
    final int c=25;
    static public int d;
    //abstract class constructor
    public AModelA() {
        System.out.println("Abstract classes can have constructors AModelA()");
    }
    //abstract method
    abstract void display();
    //instance method
    void show(){
        System.out.println("This is an instance method in abstract class");
    }
    //static method
    static void say(){
        System.out.println("This is a static method in abstract class");
    }

    public static void main(String[] args) {

    }
}
