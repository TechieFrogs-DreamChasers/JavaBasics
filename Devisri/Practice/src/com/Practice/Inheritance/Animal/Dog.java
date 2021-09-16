package com.Practice.Inheritance.Animal;
//Dog extends Animal
//step1--> Create a child class Dog-->define some variables common to dog
public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    //step2--> create a constructor with all fields along with Animal class fields
    public Dog(int size, int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
        //We are calling super class constructor explicitly
        super(1, 1, size, weight, name);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
//step3--> creating a method private to only dog
    public void bark() {
        System.out.println("Dog.bark() called");
    }
    //step4--> creating a method private to only dog
    private void walk(){
        System.out.println("Dog.walk() called");
    }
    //step5--> creating a method private to only dog
    private void run(){
        System.out.println("Dog.run() called");
    }
    //step6--> creating a method private to only dog
    private void chew() {
        System.out.println("Dog.chew() called");
    }
    //step7--> creating a method private to only dog
    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }
    //step8--> Overriding move() from parent class and adding some dog class methods
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        walk();
        run();
        moveLegs(speed);
        super.move(speed);
    }
    //step9--> Overriding move() from parent class and adding some dog class methods
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
}