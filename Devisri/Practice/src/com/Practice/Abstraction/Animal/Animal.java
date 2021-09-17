package com.Practice.Abstraction.Animal;

/*
Single Level:
Animal-->Abstract parent class
Dog--> Concrete/ Normal child class which implements abstract methods
 */
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //static method=no overriding
    public static boolean isPet() {
        return false;
    }

    public abstract void eat();

    public abstract void move();

    //public abstract static void play(); static+abstract does not allow

   /* public static void main(String[] args) {
        Animal animal=new Animal("");//not possible
    }*/
}
