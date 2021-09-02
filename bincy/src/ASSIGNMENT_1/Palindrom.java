package ASSIGNMENT_1;

import java.util.Scanner;

public class Palindrom { //15. Check Palindrom
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        obj.close();
        int sum=0;
        int temp = num;
        while(temp >0){
            int r = temp%10;
            sum= (sum*10)+r;
            temp = temp/10;

        }
        if(sum == num){
            System.out.println("The number is palindrome.");
        }
        else{
            System.out.println("The number is not palindrome.");
        }
    }
}
