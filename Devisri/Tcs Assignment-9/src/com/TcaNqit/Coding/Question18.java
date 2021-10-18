package com.TcaNqit.Coding;

import java.util.ArrayList;
import java.util.Scanner;

//Given series of numbers are:
//1,2,3,4,5,6,8,9,10.....
public class Question18 {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int position = sc.nextInt();
        sc.nextLine();
        if (position <= 0) {
            System.out.println("INVALID INPUT");
        } else {
            check(position);
        }
        sc.close();
    }

    static void check(int n) {
        ArrayList<Integer> series = new ArrayList<>();
        int max = 100;
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            series.add(i);
        }
        //System.out.println(series);
        for (int i = 0; i < series.size(); i++) {
            if (series.get(i) == 1 || series.get(i) % 2 == 0 ||
                    series.get(i) % 3 == 0 || series.get(i) % 5 == 0) {
                factors.add(series.get(i));
            }
        }
        //System.out.println(factors);
        System.out.println(factors.get(n - 1));
    }
}
/*
Enter a Number:
7
8
Enter a Number:
12
15

 */