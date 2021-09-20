package com.Practice.Interface.Animals;

public class Bird implements Aves {
    @Override
    public void fly() {
        System.out.println("In Bird Class -> Birds Fly!!!");
    }

    @Override
    public void eat() {
        System.out.println("In Bird Class -> Birds Eat!!!");
    }

    @Override
    public void sleep() {
        System.out.println("In Bird Class -> Birds sleep!!!");
    }
}
