package ASSIGNMENT_1;

import java.util.Scanner;

public class Pascals { //25.Pascals Triangle. n!/(n-r)!r!
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner obj = new Scanner(System.in);
        int num= obj.nextInt();
        obj.close();
        int j;
        for(int i=0; i<=num; i++){
            for(j=0;j<=num-i; j++){
                System.out.print(" ");
            }
            for(j=0; j<=i; j++){
                //int m= facto(i);

                System.out.print(" "+facto(i)/(facto(i-j)*facto(j)));
            }
            System.out.println(" ");
        }
        
        
    }
    static int facto(int n){
        int fact=1;
        for(int i=1; i<=n; i++)
            fact=fact*i;
        return fact;
    }
}
