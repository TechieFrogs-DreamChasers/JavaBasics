package com.Practice.Inheritance.Animal;
//Driver class for all classes in this package.
public class Main {
    public static void main(String[] args) {
        Animal animal=new Animal(1,1,5,20,"Animal");
        Dog dog=new Dog(5,10,"Yorkie",2,4,1,4,"Fur");
        System.out.println("************************");
        dog.eat();
        System.out.println("************************");
        dog.move(5);
        System.out.println("************************");
        dog.bark();
        System.out.println("************************");
        Fish fish =new Fish(2,3,"Tuna",2,4,2);
        fish.swim(5);
    }
}
