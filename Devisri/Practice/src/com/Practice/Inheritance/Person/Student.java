package com.Practice.Inheritance.Person;

public class Student extends Person {
    String designation;
    char grade;

    public Student() {
        this("Student", 'A');
        System.out.println("Child Class-->Student-->Student()");
    }

    public Student(String designation, char grade) {
        super();
        System.out.println("Child Class-->Student-->Student(parameters)");
        this.designation = designation;
        this.grade = grade;
    }

    void display() {
        System.out.println("Child Class-->Student-->display()");
        super.display();
        System.out.println(designation + "  " + grade);
    }

}
