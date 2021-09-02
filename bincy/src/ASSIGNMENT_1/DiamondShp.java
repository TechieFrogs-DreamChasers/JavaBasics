package ASSIGNMENT_1;

import java.util.Scanner;

public class DiamondShp {    // 27.Diamond Shape pattern
    public static void main(String[] args){
        System.out.println("Enter the range(half of diamond): ");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        obj.close();

        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for(int i=num-1; i>=1; i--){
            for(int j=1; j<=num-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
