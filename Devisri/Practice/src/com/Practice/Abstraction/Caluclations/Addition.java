package com.Practice.Abstraction.Caluclations;

public class Addition extends Caluclator {
    @Override
    public void calculate(int a, int b) {
        System.out.println("The addition of int+int: " + (a + b));
    }

    @Override
    public void calculate(String a, int b) {
        System.out.println("The addition/concatenation of string+int: " + (a + b));
    }

    public void calculate(int a, float b) {
        System.out.println("The addition of int+float : " + (a + b));
    }

    public void calculate(double a, float b) {
        System.out.println("The addition of double+float : " + (a + b));
    }

    public void calculate(double a, char b) {
        System.out.println("The addition of double+char : " + (a + b));
    }
}
