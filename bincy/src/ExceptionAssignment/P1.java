package ExceptionAssignment;

import java.util.InputMismatchException;
import java.util.Scanner;

//Sum of integer values
public class P1 {
    public static void main(String[] args){
        int a = 0,b = 0;
        System.out.println("Enter two integer values: ");
        Scanner obj = new Scanner(System.in);
        try{
             a = obj.nextInt();
             b = obj.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Invlid input");
            e.printStackTrace();
        }
        obj.close();
        int sum = a+b;
        System.out.println(a+" + "+b+"  = "+sum);
    }
    
}
