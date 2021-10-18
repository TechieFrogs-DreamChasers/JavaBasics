package com.TcaNqit.Coding;

import java.util.Scanner;

//Armstrong numbers between two intervals
public class Question19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first interval: ");
        int number1=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter second interval: ");
        int number2=sc.nextInt();
        sc.nextLine();
        findArmstrong(number1,number2);
        sc.close();
    }
    static void findArmstrong(int num1,int num2){
        if((num1< 0 || num2 < 0) || (num1>num2)){
            System.out.println("Invalid Input");
        }
        else{
            for(int i=num1;i<=num2;i++){
                int temp=i;
                int sum=0;
                while (temp>0){
                    int rem=temp%10;
                    sum+=(rem*rem*rem);
                    temp=temp/10;
                }
                if(sum==i){
                    System.out.println(sum);
                }
            }
        }
    }
}
/*
Enter first interval:
100
Enter second interval:
200
153

Enter first interval:
-1
Enter second interval:
1000
Invalid Input

 */