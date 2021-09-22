package com.Practice.Interface.Scenarios.scenario2;

public class Display implements Caluclations{
    public static void main(String[] args) {
        Display display=new Display();
        display.addition(x,y);
        display.subtraction(y,x);
        Caluclations.Multiplication mul=new Multiplication() {
            @Override
            void multiply(int a, int b) {
                System.out.println("The multiplication of two int's: "+(a*b));
            }
        };
        mul.multiply(x,y);
        mul.multiply(5.0f,5.0f);
        Caluclations.Division div=new Division() {
            @Override
            void divide(int a, int b) {
                super.divide(y, x);
            }

            @Override
            void divides(float a, float b) {
                super.divide(y, x);
            }
        };
        div.divide(500,200);
        div.divides(14.0f,7.0f);
    }

    @Override
    public void addition(int a, int b) {
        System.out.println("The sum of two numbers: "+(a+b));
    }

    @Override
    public void subtraction(int a, int b) {
        System.out.println("The difference of two numbers: "+(a-b));
    }
}
