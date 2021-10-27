package com.TcaNqit.Coding;

import java.util.Scanner;

//Write a code to check prime or not
public class Question12 {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        sc.close();
        int count = 0;
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                double temp = (double) number / i;
                if (temp == Math.ceil(temp)) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("Given number " + number + " is a Prime");
            } else {
                System.out.println("Given number " + number + " is not a Prime");
            }
        } else {
            System.out.println("INVALID INPUT");
        }
    }
}
/*
Enter a Number:
13
Given number 13 is a Prime
Enter a Number:
1
Given number 1 is not a Prime
Enter a Number:
0
INVALID INPUT

 */