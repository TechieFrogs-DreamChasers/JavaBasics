package com.Practice.InnerClasses;

public class PerformCalc {
    void caluclate(int a, int b) {
        int sum = a + b;
        System.out.println("Main: " + sum);
    }
}

class Caluclator {
    PerformCalc ea = new PerformCalc() {
        void caluclate(int a, int b) {
            int diff = a - b;
            System.out.println("Sub: " + diff);
        }
    };
    PerformCalc ea2 = new PerformCalc() {
        void caluclate() {
            int a = 5;
            int b = 2;
            int product = a * b;
            System.out.println("Mul: " + product);//10
        }
    };
    PerformCalc ea3 = new PerformCalc() {
        void caluclate(int a, int b) {
            int div = a / b;
            System.out.println("Div: " + div);
        }
    };

    public static void main(String[] args) {
        new Caluclator().ea.caluclate(10, 5);
        new Caluclator().ea2.caluclate(5, 2);//here it's taking calculate original logic
        new Caluclator().ea2.caluclate(10, 20);//same
        new Caluclator().ea3.caluclate(10, 2);
    }
}
