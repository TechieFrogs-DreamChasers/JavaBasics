package com.Practice.Abstraction.Caluclations;

public class Subtraction extends Caluclator {
    @Override
    public void calculate(int a, int b) {
        System.out.println("The subtraction of int-int: " + (a - b));
    }

    @Override
    public void calculate(String a, int b) {
        System.out.println("The subtraction of string-int: " + (Integer.parseInt(a) - b));
    }

    public void calculate(int a, float b) {
        System.out.println("The subtraction of int-float : " + (a - b));
    }

    public void calculate(double a, float b) {
        System.out.println("The subtraction of double-float : " + (a - b));
    }

    public void calculate(double a, char b) {
        System.out.println("The subtraction of double-char : " + (a - b));
    }
}
