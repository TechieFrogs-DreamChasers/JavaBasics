package com.Practice.Inheritance.Animal;
/*
* Hierarchical Inheritance
* Animal extends Object
* Dog extends Animal
* Fish extends Animal
* Main is the driver class for all the above classes
*/
//step1--> Create a super class Animal-->define common variables
public class Animal {
    private int brain;
    private int body;
    private int size;
    private int weight;
    private String name;
//step2--> create a constructor with all fields
    public Animal(int brain, int body, int size, int weight, String name) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.name = name;
    }
//step3--> Some animals eat().So eat can be a common method for overriding
    public void eat(){
        System.out.println("Animal.eat() called");
    }
    //step4--> All animals move().So move can be a common method for overriding
    public void move(int speed){
        System.out.println("Animal.move() called");
        System.out.println("An Animal is moving at: "+speed+" speed.");
    }
//step4-->getters
    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
