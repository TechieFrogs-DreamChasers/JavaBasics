package Assignments;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int num,temp,total=0;
        Scanner scannerObj=new Scanner(System.in);
        do{
        System.out.println("Enter your number:");
        while(!scannerObj.hasNextInt());{
        scannerObj.next();
        System.out.println("Enter a valid number:");
        } 
        num=scannerObj.nextInt();        
        }while(num!=0);{
            temp=num%10;
            total=total+temp*temp*temp;
            num/=10;
        }
        if (total==0)
        System.out.println(num+"is Armstrong");
        else
        System.out.println(num+"is not Armstrong");
        scannerObj.close();
    }
    
}
