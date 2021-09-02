package ASSIGNMENT_1;

import java.util.Scanner;

public class HalfPyramid{  //17.Program to print halfpyramid
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner obj = new Scanner(System.in);
        int num1 = obj.nextInt();
        obj.close();

        for(int i=1; i<=num1; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}