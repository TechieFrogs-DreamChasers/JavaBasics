package com.TcaNqit.Coding;

import java.util.Scanner;

//There are total n number of Monkeys....
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Number of Monkeys: ");
        int n = sc.nextInt();
        System.out.println("Enter Number of Eatable Bananas: ");
        int k = sc.nextInt();
        System.out.println("Enter Number of Eatable Peanuts: ");
        int j = sc.nextInt();
        System.out.println("Enter Total Number of Bananas: ");
        int m = sc.nextInt();
        System.out.println("Enter Total Number Peanuts: ");
        int p = sc.nextInt();
        sc.nextLine();
        int left_Monkeys = 0;
        int banana = 0;
        int peanut = 0;
        if (n < 0 && k < 0 || j < 0 || m < 0 || p < 0) {
            System.out.println("Invalid Input");
        } else {
            if (k > 0) {
                banana = m / k;
            }
            if (j > 0) {
                peanut = p / j;
            }
            left_Monkeys = n - banana - peanut;
        }
        System.out.println("Monkeys remaining on Tree: " + left_Monkeys);
        sc.close();
    }
}
/*
Enter Total Number of Monkeys:
20
Enter Number of Eatable Bananas:
2
Enter Number of Eatable Peanuts:
3
Enter Total Number of Bananas:
12
Enter Total Number Peanuts:
12
Monkeys remaining on Tree: 10
 */