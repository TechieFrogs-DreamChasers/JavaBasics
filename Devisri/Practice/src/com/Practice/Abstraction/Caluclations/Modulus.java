package com.Practice.Abstraction.Caluclations;

public class Modulus extends Division {
    @Override
    public void calculate(int a, int b) {
        super.calculate(a, b);
        System.out.println("The division of int % int: " + (a % b));
    }

    @Override
    public void calculate(int a, float b) {
        super.calculate(a, b);
        System.out.println("The division of int % float: " + (a % b));
    }

    @Override
    public void calculate(double a, float b) {
        super.calculate(a, b);
        System.out.println("The division of double % float: " + (a % b));
    }

    @Override
    public void calculate(double a, char b) {
        super.calculate(a, b);
        System.out.println("The division of double % char: " + (a % b));
    }
}
