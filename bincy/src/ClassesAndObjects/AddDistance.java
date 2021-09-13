package ClassesAndObjects;

import java.util.Scanner;

public class AddDistance {  //11. Add distance in feet-inch
    int feet1,inch1,feet2,inch2;

    void getDistance(Scanner ob){
        System.out.println("Enter the first distance");
        System.out.println("Enter feet: ");
        feet1 = ob.nextInt();
        System.out.println("Enter inches: ");
        inch1 = ob.nextInt();
        System.out.println("Enter second distance");
        System.out.println("Enter feet: ");
        feet2 = ob.nextInt();
        System.out.println("Enter inches: ");
        inch2 = ob.nextInt();
    }
    void add(){
        int inch = inch1 + inch2;
        int d = 0;
        
        if(inch>12){
            d = inch / 12;
            inch = inch % 12;
        } 
        int feet = feet1 + feet2 + d; 
        System.out.println("Total Distance is : "+feet+ " feet and  "+ inch+ " inches");
        
     }
     public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        AddDistance cl1 = new AddDistance();
        
        cl1.getDistance(obj);
        cl1.add();
        

     }
}
