package com.Practice.InnerClasses.Session;

public class Person {

    String name;
    static String hair_color;
    static int age;
    int height;

    Person(){}

    {
        name="Tom";
        height=153;
    }

    static {
        Person.hair_color="Black";
        Person.age=25;
    }

    void walk(){}

    void talk(){}

    void run(){}

    void eat(){}

    void sleep(){}

}
