package Assignments;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter your Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp;
        int rev = 0;
        int rem;
        temp = num;
        for( ;num != 0; num /= 10 )
        {
            rem = num % 10;
            rev= rev* 10 + rem;
        }sc.close();
  
        // palindrome if temp and sum are equal
        if(temp== rev){
            System.out.println(temp + " is a palindrome.");//1568651
        }
        else{
            System.out.println(temp + " is not a palindrome.");//3632566
             }
        sc.close();
            
     }   
  

    
} 
