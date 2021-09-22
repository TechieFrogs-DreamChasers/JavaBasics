package Assignments;

import java.util.Scanner;

public class MultiplicationTable {
         public static void main(String[] args) {
             
        /*int N = 5;
        for(int i=1;i<=10;i++){
            System.out.println(N+" * "+i+" = "+ N*i);
        }*/

        // Using Scanner......Taking Input from the user
        Scanner sc = new Scanner(System.in);
        int num=0;
        System.out.println("Enter a Number:");
        num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+" * "+ i +" = "+num*i);
        }sc.close();
        

    }
    
}
