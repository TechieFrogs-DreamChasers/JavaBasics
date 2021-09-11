package com.check.modifiers;

public class Maths {
    private int id;
    private String name;
    private double salary;
    private int bonus;
    private String s_class;
    public static int students;
    private int experience;

    public Maths() {
        this(56789,"Jimmy",60000,5,15);
        Teacher.school_Name="School of Students";
        //display();
    }

    private Maths(int id, String name, double salary, int experience, int bonus){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.experience=experience;
        this.bonus=bonus;
        display();
    }

    public Maths(int students, String s_class) {
        Maths.students = students;
        this.s_class = s_class;

    }

    public static void main(String[] args) {
        Maths maths=new Maths();
        //maths.display();
        System.out.println("Added bonus of "+ maths.bonus+"% for this teacher. Salary after bonus is: "+maths.get_Bonus(15.0));
        Maths maths1=new Maths(60,"Middle level");
        System.out.println("He teaches "+Maths.students+" students of "+maths1.s_class+" class of "+Teacher.school_Name);
        System.out.println("**************************************");
        Maths maths2=new Maths(1568,"Nelson",70000,2,10);
        System.out.println("Added bonus of "+ maths2.bonus+"% for this teacher. Salary after bonus is: "+maths2.get_Bonus(15.0));
        Maths maths3=new Maths(50,"High-level");
        System.out.println("He teaches "+Maths.students+" students of "+maths3.s_class+" class.");
    }
    void display(){
        System.out.println(id+" "+name+" "+salary+" "+bonus+" "+experience);
    }
    double get_Bonus(double bonus){
        bonus=(salary*(bonus/100))+salary;
        return bonus;
    }
}
