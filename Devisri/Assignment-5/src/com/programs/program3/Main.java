package com.programs.program3;

public class Main {
    public static void main(String[] args) {
        John john=new John(90,75,70);
        System.out.println("The percentage of John among three Subjects: "+john.getPercentage()+"%.");
        Tom tom=new Tom(91,80,75,85);
        System.out.println("The percentage of Tom among four Subjects: "+tom.getPercentage()+"%.");

    }
}
