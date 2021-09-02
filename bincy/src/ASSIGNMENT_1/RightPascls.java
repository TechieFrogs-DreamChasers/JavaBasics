package ASSIGNMENT_1;

import java.util.Scanner;

public class RightPascls {
    public static void main(String[] args){
        System.out.println("Enter the number of rows:  ");
        Scanner obj = new Scanner(System.in);
        int num= obj.nextInt();
        obj.close();

        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for(int i=num-1; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.print("* ");

            }
            System.out.println(" ");
        }
    }
    
}
