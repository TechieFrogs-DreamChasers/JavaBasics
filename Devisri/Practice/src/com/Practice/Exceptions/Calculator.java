package com.Practice.Exceptions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a number: ");
        int num2= sc.nextInt();
        sc.nextLine();
        int result=division(num1,num2);
        System.out.println(result);
    }
    static int division(int a,int b){
        if(b==0){
            throw new ArithmeticException("Number can't be Zero");
        } else {
            System.out.println("Valid inputs are passed");
        }
        return a/b;
    }
}
