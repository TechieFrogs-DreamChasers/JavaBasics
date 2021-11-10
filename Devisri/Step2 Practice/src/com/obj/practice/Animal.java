package com.obj.practice;

public class Animal {
    String name = "Horse";
    int age = 5;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void eat() {
        System.out.println("All Animals eat!!!");
    }

    void bark() {
        System.out.println("Few Animals make sounds!!!");
    }

    @Override
    public boolean equals(Object obj) {
        boolean flag = false;
        Animal animal = new Animal();
        if (animal.name.equals(this.name) && animal.age == this.age) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    @Override
    public String toString() {
        return "Animal[" + name + ", " + age + "]";
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
