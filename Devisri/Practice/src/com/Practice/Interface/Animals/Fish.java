package com.Practice.Interface.Animals;

public class Fish implements Animals,Amphibians{
    @Override
    public void swim() {
        System.out.println("In Fish class -> Fish swim!!!");
    }

    @Override
    public void rest() {
        System.out.println("In Fish class -> Fish rest!!!");
    }

    @Override
    public void eat() {
        System.out.println("In Fish class -> Fish eats!!!");
    }

    @Override
    public void move() {
        swim();
    }

    @Override
    public void arePets() {
        System.out.println("In Fish class -> Fish are kept by Humans!!!");
        Animals.super.arePets();
    }
}
