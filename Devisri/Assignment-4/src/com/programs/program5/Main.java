package com.programs.program5;

public class Main {
    public static void main(String[] args) {
        PostGraduate pg = new PostGraduate();
        pg.getDegree();
        System.out.println("********************************");
        UndreGraduate ug = new UndreGraduate();
        ug.getDegree();
        System.out.println("********************************");
        Degree degree = new Degree();
        degree.getDegree();
    }
}
