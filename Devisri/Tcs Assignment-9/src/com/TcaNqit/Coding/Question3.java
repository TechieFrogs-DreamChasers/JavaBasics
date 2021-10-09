package com.TcaNqit.Coding;

import java.util.Scanner;

//A washing machine works on the principle of Fuzzy system
public class Question3 {
    public static void main(String[] args) {
        System.out.println("Read the Weight: ");
        Scanner sc=new Scanner(System.in);
        int weight= sc.nextInt();
        sc.nextLine();
        Question3.calculate(weight);
        sc.close();
    }

    static void calculate(int weight) {
        int time = 0;
        if (weight == 0) {
            System.out.println("Estimated time: " + time + " minutes.");
        } else if (weight >= 1 & weight <= 2000) {
            time = 25;
            System.out.println("Estimated time: " + time + " minutes.");
        } else if (weight > 2000 & weight < 4000) {
            time = 35;
            System.out.println("Estimated time: " + time + " minutes.");
        } else if (weight == 4000) {
            time = 45;
            System.out.println("Estimated time: " + time + " minutes.");
        } else {
            System.out.println("Weight is Overloaded");
        }
    }
}
/*
Read the Weight:
2000
Estimated time: 25 minutes.
 */