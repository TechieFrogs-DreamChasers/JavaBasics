package ASSIGNMENT_1;

import java.util.Scanner;

public class Alphabets { //13. Display English Alphabets
    public static void main(String[] args){
        System.out.println("Do you want to print capital or small letters (C/S): ");
        Scanner obj = new Scanner(System.in);
        char ch= obj.next().charAt(0);
        obj.close();
        ch=Character.toUpperCase(ch);
        if(ch=='C')
            for(char i='A'; i<='Z'; i++)
                System.out.print(i +" ");
        else
            for(char i='a'; i<='z'; i++)
                System.out.print(i+ " ");
    }
}
