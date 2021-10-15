package com.TcaNqit.Coding;

import java.util.ArrayList;
import java.util.Scanner;

//Chain Marketing Organization has a scheme for income generation...
public class Question8 {
    public static void main(String[] args) {
        System.out.println("Enter Member Name: ");
        Scanner sc = new Scanner(System.in);
        String par_Name = sc.nextLine();
        System.out.println("Enter Y/N if a child Member is Present or Not: ");
        char ch = sc.next().charAt(0);
        sc.nextLine();
        ArrayList<String> child_mem = new ArrayList<>();
        int total_Mem = 1;
        if (ch == 'N') {
            System.out.println("Enter Child name: ");
            String child_name = sc.nextLine();
            total_Mem++;
            System.out.println("Total Members are: " + total_Mem);
            System.out.println("Commission Details: ");
            System.out.println(par_Name + " : 500INR");
            System.out.println(child_name + " : 250INR");
        } else if (ch == 'Y') {
            for (int i = 0; i < 2; i++) {
                System.out.println("Enter Child Member Name: ");
                String name = sc.nextLine();
                child_mem.add(name);
            }
            total_Mem += child_mem.size();
            System.out.println("Total Members are: " + total_Mem);
            System.out.println("Commission Details: ");
            System.out.println(par_Name + " : 1000INR");
            System.out.println(child_mem.get(0) + " : 250INR");
            System.out.println(child_mem.get(1) + " : 250INR");
        }
        sc.close();
    }
}
/*
Enter Member Name:
Amit
Enter Y/N if a child Member is Present or Not:
Y
Enter Child Member Name:
Virat
Enter Child Member Name:
Rajesh
Total Members are: 3
Commission Details:
Amit : 1000INR
Virat : 250INR
Rajesh : 250INR

Enter Member Name:
Amit
Enter Y/N if a child Member is Present or Not:
N
Enter Child name:
Rajesh
Total Members are: 2
Commission Details:
Amit : 500INR
Rajesh : 250INR
 */
