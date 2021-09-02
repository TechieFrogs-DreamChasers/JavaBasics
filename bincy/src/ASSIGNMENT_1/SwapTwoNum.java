package ASSIGNMENT_1;

import java.util.Scanner;

//Program to swap two numbers
public class SwapTwoNum {
    public static void main(String[] args){
        int a,b,c;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        a=obj.nextInt();
        b=obj.nextInt();
        obj.close();
        System.out.println("The numbers are a = "+ a + " and b = "+ b);
        c=a;
        a=b;
        b=c;
        System.out.println("After swapping a = "+ a +" and b = "+b );

        // Swap without using third variable
        a = a+b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping a =" + a +" and b = "+b);

    }
}
