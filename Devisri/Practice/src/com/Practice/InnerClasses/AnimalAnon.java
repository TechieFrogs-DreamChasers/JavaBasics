package com.Practice.InnerClasses;

public class AnimalAnon {
    void sound(){
        System.out.println("Animals make noise");
    }
}
 class Pet{
    AnimalAnon dog = new AnimalAnon() {
        void sound() {
            System.out.println("Dogs make noise too");
        }
    };
    AnimalAnon cat= new AnimalAnon(){
        void sound(){
            System.out.println("Cats make noise");
        }
    };

    public static void main(String[] args) {
        new Pet().dog.sound();
        new Pet().cat.sound();
    }
}
