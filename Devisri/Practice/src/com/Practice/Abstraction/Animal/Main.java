package com.Practice.Abstraction.Animal;

public class Main {
    public static void main(String[] args) {
        //Animal animal=new Animal();not possible
        // Pointing super class Animal object to the subclass dog as its reference
        Animal dog = new Dog("Dog");
        //dog.bark(); bark() method is in subclass dog. So Animal cannot access this method
        /*
        getName()---> instance+non-abstract method gets access. Because this method is in super class.
        eat()---> abstract method gets access. Because this method is in super class.
        move()---> abstract method gets access. Because this method is in super class.
         */
        dog.getName();
        dog.eat();
        dog.move();
        System.out.println(Animal.isPet() + "." + dog.getName() + " may or may not be a pet!!!");
        System.out.println("           ");
        Dog boomer = new Dog("Boomer");
        boomer.eat();
        boomer.move();
        boomer.chew();
        boomer.bark();
        System.out.println(Dog.isPet() + "." + boomer.getName() + " is a pet!!!");
        System.out.println("           ");
        Dog shelby = new Dog("Shelby");
        shelby.eat();
        shelby.move();
        shelby.chew();
        shelby.bark();
        System.out.println(Dog.isPet() + "." + shelby.getName() + " is a pet!!!");
        /*
Output:
Dog chews its food!!!
Dog eats food!!!
Dog moves. It can walk and run!!!
false.Dog may or may not be a pet!!!

Boomer chews its food!!!
Boomer eats food!!!
Boomer moves. It can walk and run!!!
Boomer chews its food!!!
Boomer barks!!!
true.Boomer is a pet!!!

Shelby chews its food!!!
Shelby eats food!!!
Shelby moves. It can walk and run!!!
Shelby chews its food!!!
Shelby barks!!!
true.Shelby is a pet!!!
*/


    }
}
