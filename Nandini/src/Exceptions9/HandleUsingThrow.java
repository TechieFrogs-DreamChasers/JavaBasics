package Exceptions9;

import java.util.Scanner;

public class HandleUsingThrow {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the Person: ");
        int age = sc.nextInt();

        if(age<18){
            try{
                throw new Exception();
            }catch(Exception e){
                System.out.println("Age should be greater than 18 ");
            }
        }else
            System.out.println("The age of the Person is "+ age);
    }
    
}
