package com.check.modifiers;

import java.util.Scanner;

public class Teacher {
    private int id;
    private String name;
    public static String school_Name;
    private double salary;
    private String s_class;
    private int students;
    private int experience;

    private Teacher() {
        this(123456,"Head",100000.0,"Whole School",5000,15);

    }

    public Teacher(String school_Name){
        Teacher.school_Name=school_Name;
    }

    public Teacher(int id, String name, double salary, String s_class, int students, int experience) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.s_class = s_class;
        this.students = students;
        this.experience = experience;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Teacher teacher1=new Teacher();
        teacher1.display();
        Teacher teacher=new Teacher(sc.nextInt(),sc.next(),sc.nextDouble(),sc.next(),sc.nextInt(),sc.nextInt());
        teacher.display();
        sc.close();
        System.out.println("************************************");
        Maths maths=new Maths();
        maths.display();
        System.out.println("Salary after bonus is: "+maths.get_Bonus(15.0));
        System.out.println("He teaches "+Maths.students);
        System.out.println("***********************************");
        English english=new English(23568,"Mary",69000.0,"Elementary",30,8,5);
        english.eng_Teacher_Details();
    }
    private void display(){
        System.out.println(id+" "+name+" "+salary+" "+s_class+" "+students+" "+experience);
    }
}
