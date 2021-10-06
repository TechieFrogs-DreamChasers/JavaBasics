package com.Practice.Inheritance.Animal;
//Fish extends Animal
//step1--> Create another child class Fish-->define some variables common to Fish
public class Fish extends Animal{
    private int gills;
    private int fins;
    private int eyes;
    //step2--> create a constructor with all fields along with Animal class fields
    public Fish(int size, int weight, String name, int gills, int fins, int eyes) {
        //We are calling super class constructor explicitly
        super(1, 1, size, weight, name);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
    }
    //step3--> creating a method private to only fish
    private void rest(){
        System.out.println("Fish.rest() called");
    }
    //step4--> creating a method private to only fish
    private void moveMuscles(){
        System.out.println("Fish.rest() called");
    }
    //step5--> creating a method private to only dog
    public void swim(int speed){
        moveMuscles();
        //step6-->we are calling animal class move method
        super.move(speed);
    }
}
