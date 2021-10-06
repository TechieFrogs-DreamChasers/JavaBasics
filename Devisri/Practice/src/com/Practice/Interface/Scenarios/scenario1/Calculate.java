package com.Practice.Interface.Scenarios.scenario1;

public class Calculate implements Calculations{
    public Calculate(){
        System.out.println("Calculate class implements Calculations interface");
    }
    @Override
    public void subtraction(int a, int b) {
        System.out.println("The difference of a,b: "+(a-b));
    }

    @Override
    public void showCalc() {
        Calculations.super.showCalc();
    }

    @Override
    public void Multiplication(int a, int b) {
        System.out.println("The product of a,b: "+(a*b));
    }

    public static void main(String[] args) {
        Calculate calculate=new Calculate();
        calculate.subtraction(Calculations.y,Calculations.x);
        System.out.println(" ");
        calculate.Multiplication(Calculations.x,Calculations.y);
        System.out.println(" ");
        Addition addition=new Addition();
        addition.add();
        Calculations calculations=new Calculate();
        calculations.showCalc();
    }
}
