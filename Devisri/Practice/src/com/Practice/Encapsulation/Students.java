package com.Practice.Encapsulation;

public class Students {
    private final String school_Name = "Virtual Tech";
    private static String class_Level;
    private int id;
    private String name;
    private boolean isRegular;
    private char gender;
    private char grade;

    public String getSchool_Name() {
        return school_Name;
    }

    public static String getClass_Level() {
        return class_Level;
    }

    public static void setClass_Level(String class_Level) {
        Students.class_Level = class_Level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRegular() {
        return isRegular;
    }

    public void setRegular(boolean regular) {
        isRegular = regular;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}
