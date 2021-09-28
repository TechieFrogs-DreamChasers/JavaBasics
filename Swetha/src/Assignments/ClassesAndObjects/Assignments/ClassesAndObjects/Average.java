package Assignments.ClassesAndObjects;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a= validateNumber(obj);
        System.out.println("Enter the value of b:");
        int b=validateNumber(obj);
        System.out.println("Enter the value of c:");
        int c=validateNumber(obj);
        int average=(a+b+c)/3;
        System.out.println("The Average value is:"+average);
        obj.close();        
    }
    static int validateNumber(Scanner obj){  //here validating the given number by passing the scanner object 
        int num;                             //as parameter to validate method.
        do
        {
            System.out.println("Enter the positive number");
            while(!obj.hasNextInt())
            {
                System.out.println("Please enter the valid number:");
                obj.next();
            }
            num=obj.nextInt();
        }
            while(num<=0);
            return num;    

    }    
    
}
