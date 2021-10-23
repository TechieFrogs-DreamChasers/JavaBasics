package ExceptionAssignment;

import java.util.InputMismatchException;
import java.util.Scanner;

//Handle checked exceptions
public class P9 {
    public static void main(String[] args){
        int num ;
        System.out.println("Enter number : ");
        Scanner obj =new Scanner(System.in);
        num = obj.nextInt();
        obj.close();
        try{
            if (num==0 ){
                System.out.println("Number is Invalid");
            }
         }catch(InputMismatchException ie){
             System.out.println(ie.getMessage());
         }
    } 
    /*public static void main(String []args) {
        System.out.println("Hello Java");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException ie){
            System.out.println("Interupted");
        }
        //throw new InterruptedException("");
        
    }*/   
}
