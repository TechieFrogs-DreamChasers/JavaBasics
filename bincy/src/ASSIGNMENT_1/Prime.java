package ASSIGNMENT_1;

import java.util.Scanner;

public class Prime {  //14.Program to print prime numbers
    public static void main(String[] args){
        System.out.println("Enter the range: ");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        obj.close();

        int j,r;
        int i=2;
        do{
            int flag = 0;
            if((num == 1)||(num == 0))
                System.out.println(" 0 and 1 are not prime numbers. ");
            for(j=2; j<=i/2; j++){
                r = i % j;
                if(r == 0){
                    flag = 1;
                    break;
                }
                    
            }
            i++;
            if (flag == 0){
                System.out.print((i-1)+ " ");
            }
        }while(i<=num);
        System.out.print(" are primes");
    }
    
}
