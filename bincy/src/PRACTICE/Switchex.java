package PRACTICE;

import java.util.Scanner;

public class Switchex {
    public static void main(String[] args){
        int mark;
    
        System.out.println("Enter the mark : ");//Enter the mark to find the grade (Failed or passed)
        Scanner obj = new Scanner(System.in);
        mark = obj.nextInt();

        System.out.println("Enter the month(1 - 12): "); // Enter the month and year to find the days in the month
        int month=obj.nextInt();
        System.out.println("Enter the year: ");
        int year = obj.nextInt();
        obj.close();
        //Finding the grade
        switch(mark){
            case 90:
                System.out.println("A grade");
                break;
            case 80:
                System.out.println("B grade");
                break;
            case 70:
                System.out.println("C grade");
                break;
            case 60:
                System.out.println("D grade");
                break;
            default:
                System.out.println("Failed");
        }
        //Extended version
        switch(mark){
            case 90:
            case 80:
            case 70:
            case 60:
                System.out.println("Passed");
                break;
            default:
                System.out.println("Failed");
        }
        //Finding the month day
        
        int day=switch(month){
            case 1 , 3 , 5 , 7 ,10 , 12:
                yield 31;
            default:
                yield 30;
             
        };
        System.out.println(day);
    }
    
}
