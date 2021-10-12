package com.TcaNqit.Coding;

import java.util.Scanner;

//Consider the below series
//0, 0, 2, 1, 4, 2, 6, 3, 8, 4, 10, 5, 12, 6, 14, 7, 16, 8
public class Question15 {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        int temp=number/2;
        int result=(number%2!=0)?(temp*2):(temp-1);
        System.out.println("The "+number+"th term: "+result);
        sc.close();
    }
}
/*
Enter a Number:
15
The 15th term: 14
Enter a Number:
7
The 7th term: 6

 */