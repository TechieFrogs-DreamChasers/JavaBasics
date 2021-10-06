package com.Practice.Interface.Animals;

public class Dog implements Animals{
    @Override
    public void eat() {
        System.out.println("In class Dog--> Dog eats!!!");
    }

    @Override
    public void move() {
        System.out.println("In class Dog--> Dog runs!!!");
    }

    //default method in the class
    public void bark() {
        System.out.println("In class Dog--> Dog barks!!!");
    }
}
