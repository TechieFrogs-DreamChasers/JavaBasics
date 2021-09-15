package com.Practice.Inheritance.Person;

public class Elementary extends Teacher{
    int no_Students;
    final String sch_Name="Virtual Tech School";
    String subject;

    public Elementary() {
        this("Sam",30,5648,56478912L,'m',"Teacher",30000.0,3,30,"English");
        System.out.println("Parent Class-->Teacher-->Child Class-->Elementary-->Elementary()");
    }

    public Elementary(String name, int age, int id, long phone, char gender, String designation, double salary, int experience, int no_Students, String subject) {
        super(name, age, id, phone, gender, designation, salary, experience);
        System.out.println("Parent Class-->Teacher-->Child Class-->Elementary-->Elementary(parameters)");
        this.no_Students = no_Students;
        this.subject = subject;
    }
    void display(){
        super.display();
        System.out.println("Parent Class-->Teacher-->Child Class-->Elementary-->display");
        System.out.println(no_Students+"  "+sch_Name+"  "+subject);
    }
}
