package com.Practice.Inheritance.Person;

public class Teacher extends Person{
    String designation;
    double salary;
    int experience;


    public Teacher() {
        this("Meghan",30,1259,45678921L,'f',"Teacher",50000.0,2);
        System.out.println("Parent Class-->Parent-->Child Class-->Teacher-->Teacher()");
    }

    public Teacher(String name, int age, int id, long phone, char gender, String designation, double salary, int experience) {
        super(name, age, id, phone, gender);
        System.out.println("Parent Class-->Parent-->Child Class-->Teacher-->Teacher()");
        this.designation = designation;
        this.salary = salary;
        this.experience = experience;

    }

    @Override
    void display() {
        super.display();
        System.out.println("Parent Class-->Parent-->Child Class-->Teacher-->display()");
        System.out.println(designation+"  "+salary+"  "+experience);
    }
}
