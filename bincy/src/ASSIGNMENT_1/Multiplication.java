package ASSIGNMENT_1;

import java.util.Scanner;

public class Multiplication {  //10. Multiplication table
    public static void main(String[] args){
        int num;
        System.out.println("Enter the number ");
        Scanner obj = new Scanner(System.in);
        num = obj.nextInt();
        obj.close();
        for(int i=1; i<=10; i++)
            System.out.println(i +" * "+ num + " = "+ i*num);
    }
}
