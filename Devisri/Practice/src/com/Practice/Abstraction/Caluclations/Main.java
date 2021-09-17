package com.Practice.Abstraction.Caluclations;

public class Main {
    public static void main(String[] args) {
        Addition add = new Addition();
        add.calculate(100, 200);
        add.calculate("Hello", 2021);
        add.calculate(200, 300.5f);
        add.calculate(500.5d, 500.5f);
        add.calculate(500.0, 'G');
        System.out.println("   ");
        Subtraction sub = new Subtraction();
        sub.calculate(1000, 200);
        sub.calculate("2022", 2021);
        sub.calculate(1500, 300.5f);
        sub.calculate(3500.5d, 500.5f);
        sub.calculate(2500.0, 'G');
        System.out.println("   ");
        Multiplication mul = new Multiplication();
        mul.calculate(100, 200);
        mul.calculate("2", 2000);
        mul.calculate(300, 300.5f);
        mul.calculate(500.5d, 500.5f);
        mul.calculate(500.0, 'G');
        System.out.println("   ");
        Division div = new Division();
        div.calculate(600, 200);
        div.calculate("200", 200);
        div.calculate(900, 300.5f);
        div.calculate(500.5d, 500.5f);
        div.calculate(500.0, 'G');
        System.out.println("   ");
        Modulus mod = new Modulus();
        mod.calculate(600, 200);
        mod.calculate(900, 300.5f);
        mod.calculate(500.5d, 500.5f);
        mod.calculate(500.0, 'G');
        System.out.println("   ");
        Caluclator cal = new Addition();
        cal.calculate(500, 500);
        cal.calculate("1000", 4000);
        Caluclator cal2 = new Subtraction();
        cal2.calculate(1500, 500);
        cal2.calculate("8000", 4000);
        Caluclator cal3 = new Multiplication();
        cal3.calculate(500, 500);
        cal3.calculate("1000", 4000);
        Caluclator cal4 = new Division();
        cal4.calculate(2500, 500);
        cal4.calculate("10000", 4000);
        Caluclator cal5 = new Modulus();
        cal5.calculate(2500, 500);
        //performs / operation
        cal5.calculate("10000", 4000);
    }
}
