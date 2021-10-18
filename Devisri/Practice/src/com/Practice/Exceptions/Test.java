package com.Practice.Exceptions;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a number: ");
        int num2=sc.nextInt();
        sc.nextLine();
        try{
        System.out.println(num1/num2);
        } catch (ArithmeticException e) {
            System.out.println("Number can't be divided by zero");
        }
        sc.close();
    }
}
/*
Enter a number:
8
Enter a number:
0
Number can't be divided by zero
 */