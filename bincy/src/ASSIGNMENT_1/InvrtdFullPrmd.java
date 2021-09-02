package ASSIGNMENT_1;

import java.util.Scanner;

public class InvrtdFullPrmd { //24.Inverted Full pyramid
    public static void main(String[] args){
        System.out.println("Enter the range: ");
        Scanner obj= new Scanner(System.in);
        int num=obj.nextInt();
        obj.close();

        int r=num;
        for(int i=1; i<=num; i++){
            for(int j=0; j<i; j++){
                System.out.print("  ");
            }

            for(int k=r+(r-1); k>0; k--){
                System.out.print(" *");
            }
            r--;
            System.out.println(" ");
        }

    }
}
