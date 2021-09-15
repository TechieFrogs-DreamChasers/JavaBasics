package com.Practice.Inheritance.Person;

public class MiddleLevel extends Student {
    boolean isRegular;
    int num_Students;
    String teacher;

    public MiddleLevel() {
        super();
        System.out.println("Parent Class-->Student-->Child Class-->MiddleLevel()");
    }

    public MiddleLevel(boolean isRegular, int num_Students, String teacher) {
        super("Student", 'B');
        System.out.println("Parent Class-->Student-->Child Class-->MiddleLevel(parameters)");
        this.isRegular = isRegular;
        this.num_Students = num_Students;
        this.teacher = teacher;
    }

    @Override
    void display() {
        System.out.println("Parent Class-->Student-->Child Class-->MiddleLevel()-->display()");
        System.out.println(isRegular + "  " + num_Students + "  " + teacher);
        super.display();
    }
}
