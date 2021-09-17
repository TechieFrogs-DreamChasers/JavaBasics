package Assignment2;

import java.util.Scanner;

public class Average {

    
    double average;
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    

    public static void main(String[] args) {

        System.out.println("Enter Three Numbers: ");
        Average a = new Average();
        a.calculateAverage();
     
        
    }

    void calculateAverage(){

        average = ((a + b + c)/ 3);
        System.out.println("Average of Three Numbers is: " + average);
    }
    
}
