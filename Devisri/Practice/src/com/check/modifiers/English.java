package com.check.modifiers;

public class English {
    private int id;
    private String name;
    public double salary;
    private String s_class;
    private int students;
    private int experience;
    public int bonus;

    public English(int id, String name, double salary, String s_class, int students, int experience, int bonus) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.s_class = s_class;
        this.students = students;
        this.experience = experience;
        this.bonus = bonus;
        Teacher.school_Name="School of Students";
    }

    public static void main(String[] args) {

    }

    void eng_Teacher_Details(){
        System.out.println(id+" "+name+" "+salary+" "+s_class+" "+students+" "+experience+" "+bonus+" "+Teacher.school_Name);
        System.out.println("Added bonus of "+bonus+"%. Salary after bonus is "+get_Bonus(bonus));
    }

    double get_Bonus(double bonus){
        bonus=(salary*(bonus/100))+salary;
        return bonus;
    }

}
