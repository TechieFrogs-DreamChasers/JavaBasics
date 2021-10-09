package com.Practice.array;

import java.util.Scanner;

public class PerformCalculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ints = new int[5];
        int sum = sum(ints, sc);
        for (int i : ints) {
            System.out.println("Integer Value at this index: " + i);
        }
        System.out.println("The Sum of the array elements: " + sum);
        double[] doubles = new double[5];
        double sub = diff(doubles, sc);
        for (double d : doubles) {
            System.out.println("Double Value at this index: " + d);
        }
        System.out.println("The Subtraction of the array elements: " + sub);
        sc.close();
    }

    static int sum(int[] ints, Scanner sc) {
        int value = 0;
        for (int i = 0; i < ints.length; i++) {
            System.out.println("Enter a Number: ");
            ints[i] = sc.nextInt();
            value += ints[i];
        }
        return value;
    }

    static double diff(double[] doubles, Scanner sc) {
        double value = 0.0D;
        for (int i = 0; i < doubles.length; i++) {
            System.out.println("Enter a Number: ");
            doubles[i] = sc.nextInt();
            value -= doubles[i];
        }
        return value;
    }
}
/*
Enter a Number:
10
Enter a Number:
20
Enter a Number:
30
Enter a Number:
40
Enter a Number:
50
Value at this index: 10
Value at this index: 20
Value at this index: 30
Value at this index: 40
Value at this index: 50
The Sum of the array elements: 150
Enter a Number:
50
Enter a Number:
40
Enter a Number:
30
Enter a Number:
20
Enter a Number:
10
Double Value at this index: 50.0
Double Value at this index: 40.0
Double Value at this index: 30.0
Double Value at this index: 20.0
Double Value at this index: 10.0
The Subtraction of the array elements: -150.0
 */
