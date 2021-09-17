package com.Practice.Abstraction.Caluclations;

public class Multiplication extends Caluclator {
    @Override
    public void calculate(int a, int b) {
        System.out.println("The product of int*int: " + (a * b));
    }

    @Override
    public void calculate(String a, int b) {
        System.out.println("The product of string*int: " + (Integer.parseInt(a) * b));
    }

    public void calculate(int a, float b) {
        System.out.println("The product of int*float : " + (a * b));
    }

    public void calculate(double a, float b) {
        System.out.println("The product of double*float : " + (a * b));
    }

    public void calculate(double a, char b) {
        System.out.println("The product of double*char : " + (a * b));
    }
}
