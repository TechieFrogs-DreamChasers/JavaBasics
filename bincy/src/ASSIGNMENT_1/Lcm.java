package ASSIGNMENT_1;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args){ //12.LCM of two numbers (a*b)/gcd(a,b)
        System.out.println("Enter two numbers: ");
        Scanner obj = new Scanner(System.in);
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        obj.close();
        int limit;
        if(num1<num2)
            limit=num1;
        else
            limit=num2;
        int r1,r2,i=1,lcm=1;
        do{
            r1 = num1 % i;
            r2 = num2 % i;
            
            if(r1==0 && r2==0)
                lcm = i;
            
            
            i++;
        }while(i<=limit);
        
        lcm = (num1*num2)/lcm;

        System.out.println("The Lcm of  "+num1+" and "+num2+" : "+lcm);
    }
}
