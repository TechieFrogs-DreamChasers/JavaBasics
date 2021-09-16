package Assignments;

import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args) {
        int n;
        Scanner scannerObj=new Scanner(System.in);
        /*do{
        System.out.println("Enter a number:");
            while(!scannerObj.hasNextInt());{
            scannerObj.nextLine();
            System.out.println("Please Enter a valid number:");
            } n =scannerObj.nextInt();
        }while(n>=0);*/
        n =scannerObj.nextInt();
        if(n%2==1)
        System.out.println(n + " is Odd");
        else
        System.out.println(n+" is Even");
        scannerObj.close();
        
    }
    
}
