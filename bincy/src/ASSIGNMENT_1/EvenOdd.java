package ASSIGNMENT_1;

import java.util.Scanner;

public class EvenOdd { //4. Program to check whether the given number is even or odd
    public static void main(String[] args){
        int a;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        a=obj.nextInt();
        obj.close();
        if(a % 2 == 1)
            System.out.println("The number is Odd");
        else
            System.out.println("The number is Even");
    }
}
