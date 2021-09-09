//package Practice.src;

public class Animal {
    static String type;
    String name;
    int size;
    int age;

    void eat() {
        System.out.println("Animals can eat()---- Main class method called");
    }

    void move() {
        System.out.println("Animals can move()---- Main class method called");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.name = "Cat");
        System.out.println(animal.age = 5);
        System.out.println(animal.size = 3);
        System.out.println(Animal.type = "Domestic");
        animal.eat();
        animal.move();

        Animal animal1 = new Animal();
        System.out.println(animal1.name = "Horse");
        System.out.println(animal1.age = 6);
        System.out.println(animal1.size = 20);
        System.out.println(Animal.type = "Herbivore");
        animal1.eat();
        animal1.move();
        System.out.println(animal.name + " " + animal1.name + " " + Animal.type + " " + Animal.type);

        Dog dog = new Dog();
        System.out.println(dog.name = "Boomer");
        System.out.println(dog.age = 5);
        System.out.println(dog.size = 3);
        dog.bark();
        dog.move();

        Crow crow = new Crow();
        System.out.println(crow.name = "Black Crow");
        System.out.println(crow.age = 2);
        System.out.println(crow.size = 2);
        crow.fly();
        crow.move();

        Fish fish = new Fish();
        System.out.println(fish.name = "Gold Fish");
        System.out.println(fish.age = 3);
        System.out.println(fish.size = 5);
        fish.swim();
        fish.move();

        System.out.println("**** Another java file Season ****");
        Season season = new Season();
        season.life();
        System.out.println(Season.name = "Autumn");
        System.out.println(Season.type = "Hot");

    }
}

class Dog {
    String name;
    int size;
    int age;

    void bark() {
        System.out.println("Dogs can bark---- Dog class bark() called");
    }

    void move() {
        System.out.println("Dogs can move---- Dog class move() called");
    }
}

class Crow {
    String name;
    int size;
    int age;

    void fly() {
        System.out.println("Crows can fly---- Crow class fly() called");
    }

    void move() {
        System.out.println("Crows can move---- Crow class move() called");
    }
}

class Fish {
    String name;
    int size;
    int age;

    void swim() {
        System.out.println("Fish can swim----- Fish class swim() called");
    }

    void move() {
        System.out.println("Fish can move---- Fish class move() called");
    }
}
