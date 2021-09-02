package ASSIGNMENT_1;

import java.util.Scanner;

public class SandGlass {  //30.SandGlass
    public static void main(String[] args){
        System.out.println("Enter the range: ");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        obj.close();

        for(int i=1;i<=num; i++){
            for(int j=num-i; j<=num; j++){
                System.out.print(" ");
            }
            for(int k=i;k<=num; k++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int i=1; i<=num-1; i++){
            for(int j=i; j<=num-1; j++){
                System.out.print(" ");
            }
            for(int k=(num-1)-i; k<=num-1; k++){
                System.out.print(" *");
            }
            System.out.println("  ");
        }
    }
    
}
