package ExceptionAssignment;

import java.util.InputMismatchException;
import java.util.Scanner;

//Catch multiple exceptions
public class P2 {
    public static void main(String[] args){
        int a =0,b=0;
        System.out.println("enter two integers: ");
        Scanner obj =new Scanner(System.in);
        String s = "John";
        try{
        a = obj.nextInt();
        b = obj.nextInt();
        obj.close();
        System.out.println("sum = "+(a+b));
        System.out.println(a/b);
        System.out.println(s.charAt(5));
        }catch(InputMismatchException ie){
            System.out.println("Invlid Input ");
        }catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }catch(IndexOutOfBoundsException ie){
            System.out.println(ie.getMessage());
            System.out.println(s.charAt(2));
        }
       
    }
    
}
