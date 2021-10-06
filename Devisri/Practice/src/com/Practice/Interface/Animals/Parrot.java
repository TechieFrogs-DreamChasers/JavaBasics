package com.Practice.Interface.Animals;

public class Parrot extends Bird implements Animals,Aves{
    //No error Override Methods
    @Override
    public void fly() {
        super.fly();
        System.out.println("In Parrot class->Parrots fly!!!");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("In Parrot class->Parrots are fond of Guava!!!");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("In Parrot class->Parrots rest!!!");
    }
    // error--> implement methods
    @Override
    public void move() {
        fly();
    }

    @Override
    public void arePets() {
        Animals.super.arePets();
        System.out.println("In Parrot class->Parrots are pets!!!!!!");
    }
}
