package ASSIGNMENT_1;

import java.util.Scanner;

public class Factorial {     //8. Factorial of a number
    public static void main(String[] args){
        int num,num1,fact=1;
        System.out.println("Enter a number : ");
        Scanner obj = new Scanner(System.in);
        num= obj.nextInt();
        obj.close();
        num1=num;
        
        while(num > 0){
            fact= fact *num;
            num--;
        }
        System.out.println("Factorial of  " + num1 +" is "+ fact);
        fact=1;
        for(int i=1; i<=num1; i++)
            fact= fact * i;

        System.out.println("Factorial: "+ fact);

    }
    
}
