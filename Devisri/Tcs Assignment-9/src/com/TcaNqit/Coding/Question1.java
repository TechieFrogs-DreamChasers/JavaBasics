package com.TcaNqit.Coding;

import java.util.Scanner;

//A Jar of candies
public class Question1 {
    public static void main(String[] args) {
        //Supposing jar capacity as 10
        int n = 10;
        //Minimum number of candies left in a jar
        int k = 5;
        //Sold candies input
        System.out.println("Enter an Input Value: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.nextLine();
        //Candies sold has to be >=1 and <= minvalue
        if (input >= 1 && input <= 5) {
            System.out.println("Sold candies: " + input);
            System.out.println("Candies left: " + (n - input));
        }
        //If sold candies are 0
        else {
            System.out.println("INVALID INPUT");
            System.out.println("Candies left: " + n);
        }
        sc.close();
    }
}
/*
Enter an Input Value:
3
Sold candies: 3
Candies left: 7

Enter an Input Value:
0
INVALID INPUT
Candies left: 10
 */