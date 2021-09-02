package ASSIGNMENT_1;

import java.util.Scanner;

public class Hcf { // 11.HCF or GCD
    public static void main(String[] args){
        int limit;
        System.out.println("Enter two numbers: ");
        Scanner obj = new Scanner(System.in);
        int num1= obj.nextInt();
        int num2= obj.nextInt();
        obj.close();

        if(num1<num2)
            limit=num1;
        else
            limit=num2;
        int hcf=1;
        for(int i=1; i<=limit; i++){
            int r1 = num1%i;
            int r2 = num2%i;
            if(r1==0 && r2==0){
                hcf=i;
            }

        }
        System.out.println("HCF of "+num1+" and "+ num2+": "+hcf);


    }
    
}
