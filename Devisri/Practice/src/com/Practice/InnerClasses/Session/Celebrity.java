package com.Practice.InnerClasses.Session;

public class Celebrity extends Person{

    public Celebrity() {
    }

    {
        name="Meghan";
        height=160;
    }
    static {
        Person.hair_color="Grey";
        Person.age=41;
    }

    @Override
    void walk() {
        super.walk();
    }

    @Override
    void talk() {
        super.talk();
    }

    @Override
    void run() {
        super.run();
    }

    @Override
    void eat() {
        super.eat();
    }

    @Override
    void sleep() {
        super.sleep();
    }

    void perform(){}

    protected static class PrivateLife{
        PrivateLife(){}
        void swim(){}
        void play(){}
    }

    public static void main(String[] args) {
        Celebrity celebrity=new Celebrity();
    }
}
