package TCSNQT.Program2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Trainee1 t1 = new Trainee1(91,90,89);
        Trainee2 t2 = new Trainee2(90,98,99);
        Trainee3 t3 = new Trainee3(90,20,30);

        if(t1.getAverage()<70){
            System.out.println("Trainee1 is not Eligible ");
        }else
        System.out.println("Trainee1 is Eligible");

        if(t2.getAverage()<70){
            System.out.println("Trainee2 is not Eligible ");
        }else
        System.out.println("Trainee2 is Eligible");

        if(t3.getAverage()<70){
            System.out.println("Trainee3 is not Eligible ");
        }else
        System.out.println("Trainee3 is Eligible");

        int t1r1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Oxygen levels for Round One: ");
         t1r1= sc.nextInt();
         t1.getround1(t1r1);

    }
}
