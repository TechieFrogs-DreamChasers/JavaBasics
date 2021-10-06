package com.Practice.Interface.Animals;

public class Horse implements Animals,Herbivores{
    @Override
    public void sleep() {
        System.out.println("In class Horse -> Horse sleeps!!!");
    }

    @Override
    public void eat() {
        System.out.println("In class Horse -> Horse eats!!!");
    }

    @Override
    public void move() {
        System.out.println("In class Horse -> Horse runs!!!");
    }

    @Override
    public void arePets() {
        Animals.super.arePets();
        System.out.println("In class Horse -> Horse are raised by Humans!!!");
    }

    @Override
    public void chew() {
        System.out.println("In class Horse -> Horse chews!!!");
    }
}
