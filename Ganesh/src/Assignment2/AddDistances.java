package Assignment2;

import java.util.Scanner;

public class AddDistances {
    double inch;
    double feet;
        void getData(Scanner sc){
        System.out.println("Enter the Distance in Inch's :");
        this.inch = sc.nextDouble();        
    }
    double inchToFeet(){
        this.feet = (0.0833333333 * this.inch);
        return feet;
    }
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        AddDistances d1 = new AddDistances();
        d1.getData(sc);
        AddDistances d2 = new AddDistances();
        d2.getData(sc);
        double a = d1.inchToFeet();
        double b = d2.inchToFeet();
        double sumOfDistances = a+b;
        System.out.println("Sum of Distances in Feet :"+sumOfDistances);

        sc.close();

    }
}
