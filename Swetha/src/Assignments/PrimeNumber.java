package Assignments;

import java.util.Scanner;

public class PrimeNumber { 







    public static void main(String args[]) {
        int num;
        int temp;
        boolean isPrime=true;
        Scanner scannerObj= new Scanner(System.in);
        do{
        System.out.println("Enter any number:");
        while(!scannerObj.hasNextInt()){
            scannerObj.next();
        System.out.println("Please Enter a valid number:");
        }
         num=scannerObj.nextInt();
        }  while(num<=0) ;
    
        for(int i=2;i<=num/2;i++)
        {
               temp=num%i;
           if(temp==0)
           {
              isPrime=false;
              break;
           }
        }
        //If isPrime is true then the number is prime else not
        if(isPrime)
           System.out.println(num + " is a Prime Number");
        else
           System.out.println(num + " is not a Prime Number");
           scannerObj.close();
    }
}