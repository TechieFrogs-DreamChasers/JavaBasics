package ASSIGNMENT_1;

import java.util.Scanner;

public class HalfPyrmdNum {  //18. Half pyramid using numbers
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        obj.close();
        
        for(int i=1; i<=num; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j +" ");
            }
            System.out.println("");
        }
    }
}
