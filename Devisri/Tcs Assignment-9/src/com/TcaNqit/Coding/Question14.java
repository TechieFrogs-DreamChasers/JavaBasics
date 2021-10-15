package com.TcaNqit.Coding;

import java.util.Scanner;

//Find the nth term of the series.
//1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243,64, 729, 128, 2187 ….
public class Question14 {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        //Checking of the nth term will be at even position or odd position
        //Odd positions are powers of 2
        //Even positions are powers of 3
        if(number%2==0){
            //nth position(if even) will be at n/2 position
            three_Power(number/2);
        } else {
            //nth position(if odd) will be at ((n/2)+1) position
            two_Power((number/2)+1);
        }
        sc.close();
    }
    static void two_Power(int number){
        //number-1 because powers start from 0 not 1
        int n;
        n= (int) Math.pow(2,number-1);
        System.out.println("The "+number+"th term is: "+n);
    }
    static void three_Power(int number){
        int n;
        n= (int) Math.pow(3,number-1);
        System.out.println("The "+number+"th term is: "+n);
    }
}
/*
Enter a Number:
15
The 8th term is: 128
Enter a Number:
10
The 5th term is: 81
*/