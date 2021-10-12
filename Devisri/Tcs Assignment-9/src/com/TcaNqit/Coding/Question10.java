package com.TcaNqit.Coding;

import java.util.ArrayList;
import java.util.Scanner;

//A doctor has a clinic where he serves his patients. The doctor’s consultation...
public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int earn_Day = 0;
        ArrayList<Integer> p_Age = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            //System.out.println("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine();
            p_Age.add(age);
        }
        for (int i = 0; i < p_Age.size(); i++) {
            if (p_Age.get(i) <= 0 || p_Age.get(i) > 120) {
                System.out.println("Invalid Age");
                earn_Day = 0;
            } else if (p_Age.get(i) < 17) {
                earn_Day += 200;
            } else if (p_Age.get(i) >= 17 && p_Age.get(i) < 40) {
                earn_Day += 400;
            } else if (p_Age.get(i) >= 40) {
                earn_Day += 300;
            } else {
                System.out.println("Invalid Input");
                earn_Day = 0;
            }
        }
        System.out.println("Total Income: " + earn_Day + "INR.");
        sc.close();
    }
}
/*
20
30
40
50
2
3
14
Total Income: 2000INR.
 */