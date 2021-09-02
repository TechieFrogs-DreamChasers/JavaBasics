package ASSIGNMENT_1;

import java.util.Scanner;

public class FullPrmd {  // 22. Program to print full pyramid using *
    public static void main(String[] args){
        System.out.println("Enter the range: ");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        obj.close();
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++)
                System.out.print(" ");
            for(int k=1; k<=i; k++)
                System.out.print("* ");
            System.out.println(" ");
        }
    }
}
