package com.Practice.Interface.Animals;

public class Main {
    public static void main(String[] args) {
        Animals animal=new Animals() {
            @Override
            public void eat() {
                System.out.println("In main method-->eat() called");
            }

            @Override
            public void move() {
                System.out.println("In main method-->move() called");
            }
        };
        System.out.println(Animals.name);
        animal.arePets();
        animal.move();
        animal.eat();
        System.out.println(" ");
        Herbivores herbivores = new Herbivores() {
            @Override
            public void sleep() {
                System.out.println("In main method-->sleep() called");
            }

            @Override
            public void move() {
                System.out.println("In main method-->move() called");
            }

            @Override
            public void chew() {
                System.out.println("In main method-->chew() called");
            }
        };
        herbivores.sleep();
        herbivores.move();
        herbivores.chew();
        System.out.println(" ");
        Amphibians amphibians=new Amphibians() {
            @Override
            public void swim() {
                System.out.println("In main method-->swim() called");
            }

            @Override
            public void rest() {
                System.out.println("In main method-->rest() called");
            }
        };
        amphibians.swim();
        amphibians.rest();
        System.out.println(" ");
        Aves aves=new Aves() {
            @Override
            public void fly() {
                System.out.println("In main method-->fly() called");
            }

            @Override
            public void eat() {
                System.out.println("In main method-->eat() called");
            }

            @Override
            public void sleep() {
                System.out.println("In main method-->sleep() called");
            }
        };
        aves.fly();
        aves.eat();
        aves.sleep();
        System.out.println(" ");
        Dog dog=new Dog();
        dog.move();
        dog.eat();
        dog.arePets();
        dog.bark();
        System.out.println(" ");
        Horse horse=new Horse();
        horse.arePets();
        horse.sleep();
        horse.chew();
        horse.move();
        horse.eat();
        System.out.println(" ");
        Fish fish=new Fish();
        fish.arePets();
        fish.swim();
        fish.eat();
        fish.move();
        fish.rest();
        System.out.println(" ");
        Bird bird=new Bird();
        bird.eat();
        bird.sleep();
        bird.fly();
        System.out.println(" ");
        Parrot parrot=new Parrot();
        parrot.fly();
        parrot.arePets();
        parrot.sleep();
        parrot.eat();
        parrot.move();
    }
}
