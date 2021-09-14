package com.Practice.Inheritance.Person;

public class MainPerson {
    public static void main(String[] args) {
        MiddleLevel ml = new MiddleLevel(true, 30, "Meghan");
        ml.display();
        System.out.println("*********************");
        //Student s=new Student("Student",'B');
        //s.display();
        //System.out.println("*********************");
        Person p = new Person();
        p.display();
    }
}
