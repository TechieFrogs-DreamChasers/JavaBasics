package ASSIGNMENT_1;

import java.util.Scanner;

public class SumOfNatural {
    public static void main(String[] args){
        int num,sum=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num=obj.nextInt();
        obj.close();
        
        for(int i=1; i<=num; i++)
            sum= sum + i ;
        System.out.println("Sum of natuaral numbers: "+ sum);
        
        sum=0;
        while(num>0){
            sum = sum + num;
            num--;
        }
            
        System.out.println(" Sum = "+ sum);
    }
}
