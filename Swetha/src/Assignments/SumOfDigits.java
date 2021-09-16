package Assignments;

import java.util.Scanner;

public class SumOfDigits{
    public static void main(String[] args) {
        int num,digit,sum=0;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("Enter the Number:");
        while(num>0){
            digit=num%10;//finds last digit of the given number
            sum=sum+digit;//adding last digit of a number to the sum variable
            num=num/10; 
        } sc.close();
        System.out.println("sum of the digit is "+sum); 
    }
}