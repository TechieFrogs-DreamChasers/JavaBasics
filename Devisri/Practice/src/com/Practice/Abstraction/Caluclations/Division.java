package com.Practice.Abstraction.Caluclations;

public class Division extends Caluclator {
    @Override
    public void calculate(int a, int b) {
        System.out.println("The division of int/int: " + (a / b));
    }

    @Override
    public void calculate(String a, int b) {
        System.out.println("The division of string/int: " + (Integer.parseInt(a) / b));
    }

    public void calculate(int a, float b) {
        System.out.println("The division of int/float : " + (a / b));
    }

    public void calculate(double a, float b) {
        System.out.println("The division of double/float : " + (a / b));
    }

    public void calculate(double a, char b) {
        System.out.println("The division of double/char : " + (a / b));
    }
}
