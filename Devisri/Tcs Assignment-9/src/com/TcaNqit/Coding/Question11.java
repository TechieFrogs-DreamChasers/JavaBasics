package com.TcaNqit.Coding;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        System.out.println("Enter a Year: ");
        Scanner sc=new Scanner(System.in);
        int year = sc.nextInt();
        sc.nextLine();
        checkLeapYear(year);
        sc.close();
    }
    static void checkLeapYear(int year){
        if(((year%4==0)&&(year%100!=0)) || (year%400==0)){
            System.out.println("Entered "+year+" is a Leap Year!!!");
        }else {
            System.out.println("Entered "+year+" is not a Leap Year!!!");
        }
    }
}
/*
Enter a Year:
2004
Entered 2004 is a Leap Year!!!
Enter a Year:
2021
Entered 2021 is not a Leap Year!!!
 */