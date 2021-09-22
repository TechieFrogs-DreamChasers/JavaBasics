package Assignments;

import java.util.Scanner;

public class SumOfNatNum {
    
    public static void main(String[] args) {
        Scanner scobj =new Scanner(System.in); 
        int num;    //Declaring the number
        System.out.println("Enter the Number:");
        num = scobj.nextInt(); //Initializing the number
        int sum=0; //variable to caluculate sum
        
        for(int i = 1;i<=num;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of Natural Numbers is :"+ sum);
        scobj.close();
    }
    
    
}
