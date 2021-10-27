package Exceptions9;

import java.util.Scanner;

public class DisplaySumInteger {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer Value1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter an Integer Value2: ");
        int n2 = sc.nextInt();
        //sc.close();
        try{
            sum(n1,n2);
        }catch(AdditionException e){
            System.out.println("Sum is less than 0, ReEnter values: ");
        }
    }

    private static void sum(int num1, int num2) throws AdditionException {
        if ((num1 + num2) < 0) {
            throw new AdditionException("Sum of 2 Integers is less than 0: ");
            
        } else {
            System.out.println("Sum of given integers: " + (num1 + num2));
        }
    }

}

class AdditionException extends ArithmeticException {
    public AdditionException(String s) {
        super(s);
    }
}
