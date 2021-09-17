package com.Practice.Abstraction.Animal;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(getName() + " barks!!!");
    }

    public void chew() {
        System.out.println(getName() + " chews its food!!!");
    }

    //Method hiding
    public static boolean isPet() {
        return true;
    }

    @Override
    public void eat() {
        chew();
        System.out.println(getName() + " eats food!!!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " moves. It can walk and run!!!");
    }

    /*public static void main(String[] args) {
       // Animal animal=new Animal("Dog"); not possible
    }*/
}
