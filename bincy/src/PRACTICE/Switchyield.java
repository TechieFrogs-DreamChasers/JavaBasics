package PRACTICE;

import java.util.Scanner;

public class Switchyield {
    public static void main(String[] args){
        int grade;
        int mark;
        Scanner obj = new Scanner(System.in);
        
        do
        {
        
             System.out.println("Enter your mark: ");

            while(!obj.hasNextInt()){

                System.out.println("Please enter a valid mark: ");
                obj.next();
            }
            mark = obj.nextInt();
        
        }while(mark<=0);
        System.out.println("Entered mark: "+ mark);
        obj.close();
        
        grade=switch(mark){
        case 90,80:
            yield 1;
        case 70,60 :
            yield  2;
        default :
             yield  3;
        
        };
        System.out.println(grade);
    }
    
}
