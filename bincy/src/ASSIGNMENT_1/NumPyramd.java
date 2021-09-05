package ASSIGNMENT_1;

import java.util.Scanner;

public class NumPyramd {  //23.Pyramid5 using numbers
    public static void main(String[] args){ //23. Pyramid5 using numbers
        System.out.println("Enter the range: ");
        Scanner obj= new Scanner(System.in);
        int num= obj.nextInt();
        obj.close();

        for(int i=1; i<=num; i++){
            int j, k, l;
            for(j=1; j<=num-i; j++)
                System.out.print("  ");
            for(k=i; k<=i+(i-1); k++){
                System.out.print(k+" ");
            }
            for( l=k-2; l>=i; l-- ){
                System.out.print(l+ " ");
            }
            System.out.println(" ");
        }
    }
}
