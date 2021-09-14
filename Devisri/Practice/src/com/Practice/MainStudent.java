package com.Practice;

import com.Practice.Encapsulation.Students;

public class MainStudent {
    public static void main(String[] args) {
        Students jimmy = new Students();
        jimmy.setId(15986);
        jimmy.setName("Jimmy");
        jimmy.setGender('m');
        jimmy.setGrade('A');
        jimmy.setRegular(true);
        Students.setClass_Level("Middle Class");
        System.out.println(jimmy.getSchool_Name() + " | " + Students.getClass_Level() +
                " | " + jimmy.getId() + " | " + jimmy.getName() + " | " + jimmy.getGender() +
                " | " + jimmy.getGrade() + " | " + jimmy.isRegular());
        System.out.println("********************************");
        Students stella = new Students();
        stella.setId(26758);
        stella.setName("Stella");
        stella.setGender('f');
        stella.setGrade('A');
        stella.setRegular(false);
        Students.setClass_Level("Elementary Class");
        System.out.println(stella.getSchool_Name() + " | " + Students.getClass_Level() +
                " | " + stella.getId() + " | " + stella.getName() + " | " + stella.getGender() +
                " | " + stella.getGrade() + " | " + stella.isRegular());
    }
}
