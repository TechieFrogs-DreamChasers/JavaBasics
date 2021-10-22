package Exceptions9;

import java.util.Scanner;

public class HandleUsingThrows {
    public static void main(String[] args) throws RestrictAgeException {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the Person: ");
        int age = sc.nextInt();

        if(age<18){
               throw new RestrictAgeException("Age should be greater than 18");
            
        }else
            System.out.println("The age of the Person is "+ age);
    }
}
    
class RestrictAgeException extends Exception{
    public RestrictAgeException(String a){
        super(a);
    }
}
