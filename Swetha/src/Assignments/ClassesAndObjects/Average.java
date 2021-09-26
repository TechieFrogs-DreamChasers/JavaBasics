package Assignments.ClassesAndObjects;

import java.util.Scanner;

public class Average {
    int a,b,c,i;
    void average()
    {
        double i=(a+b+c)/3;
        System.out.println("Average="+i);
    }
    public static void main(String[] args) {
        Average avg=new Average();
        avg.display();
        System.out.println("Enter the vales of a,b,c");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();


        
    }
    
}
