package com.TcaNqit.Coding;

import java.util.Scanner;

//Using a method pass two variables and calculate sum
public class Question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = valueInt(sc);
        sc.nextLine();
        float number2 = valueFloat(sc);
        sc.nextLine();
        addition(number1, number2);
    }

    static void addition(int num1, float num2) {
        float result = num1 + num2;
        System.out.println("Sum of int + float: " + result);
    }

    static int valueInt(Scanner sc) {
        int num;
        do {
            System.out.println("Enter Your Number: ");
            while (!sc.hasNextInt()) {
                System.out.println("Please check the entered value");
                sc.next();
            }
            num = sc.nextInt();
        } while (num <= 0);
        return num;
    }

    static float valueFloat(Scanner sc) {
        float num;
        do {
            System.out.println("Enter Your Number: ");
            while (!sc.hasNextFloat()) {
                System.out.println("Please check the entered value");
                sc.next();
            }
            num = sc.nextFloat();
        } while (num <= 0);
        return num;
    }
}
/*
Enter Your Number:
20
Enter Your Number:
20.38
Sum of int + float: 40.379997
 */