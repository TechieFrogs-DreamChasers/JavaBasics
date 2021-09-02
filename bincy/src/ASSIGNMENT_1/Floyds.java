package ASSIGNMENT_1;

import java.util.Scanner;

public class Floyds { //26.Floyd's Triangle
    public static void main(String[] args){
        System.out.println("Enter the range: ");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        obj.close();

        int n=1;
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i;j++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println(" ")    ;
        }
    }


}
