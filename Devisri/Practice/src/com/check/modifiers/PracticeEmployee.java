package com.check.modifiers;

public class PracticeEmployee {
    private String department;
    public String name;
    public int id;
    double salary_limit;
    private int experience;
    String email;

    public PracticeEmployee() {
        this("Accounts", "Tim", 12, 50000.0, 2, "tim@email.com");
    }

    PracticeEmployee(String name, int id, double salary_limit, String email) {
        this("Bank", name, id, salary_limit, 5, email);
        //this.name = name;
        //this.id = id;
        //this.salary_limit = salary_limit;
        //this.email = email;
    }

    private PracticeEmployee(String department, String name, int id, double salary_limit, int experience, String email) {
        this.department = department;
        this.name = name;
        this.id = id;
        this.salary_limit = salary_limit;
        this.experience = experience;
        this.email = email;
    }

    public static void main(String[] args) {
        PracticeEmployee pe1 = new PracticeEmployee();
        pe1.display();
        pe1.privateDisplay();

        PracticeEmployee pe2 = new PracticeEmployee("John", 15, 60000, "john@email.com");
        pe2.display();
        pe2.privateDisplay();

        PracticeEmployee pe3 = new PracticeEmployee("Programmer", "Sam", 16, 100000, 6, "sam@email.com");
        pe3.display();
        pe3.privateDisplay();

        System.out.println("*************************************");
        PracticeJob pj1=new PracticeJob("Joe",6589,3,"joe@email.com");
        pj1.jobDisplay();
        pj1.name="Aria";
        pj1.email="aria@email.com";
        pj1.experience=3;
        pj1.id=1598;
        pj1.jobDisplay();
        pj1.jobPrivateDetails();
    }

    public void display() {
        System.out.println(name + " " + id + " " + salary_limit + " " + email+" "+department+" "+experience);
    }

    private void privateDisplay() {
        System.out.println(department + " " + experience);
    }
}
