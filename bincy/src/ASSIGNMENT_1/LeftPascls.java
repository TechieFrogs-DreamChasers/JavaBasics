package ASSIGNMENT_1;

import java.util.Scanner;

public class LeftPascls { //29.Left Pascals
    public static void main(String[] args){
        System.out.println("Enter the range: ");
        Scanner obj= new Scanner(System.in);
        int num=obj.nextInt();
        obj.close();

        for(int i=1; i<=num; i++){
            for(int j=i; j<=num; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=num-1; i>=1; i--){
            for(int j=i-1; j<=num-1; j++){
                System.out.print(" ");
            }
            for(int k=i; k>=1; k--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
