package Assignment2;
import java.util.Scanner;

public class AreaofRectangle {

    double length;
    double breadth;

    public AreaofRectangle(double length,double breadth){
        this.breadth = breadth;
        this.length = length;
    }
    public static void main(String[] args) {
        
        System.out.println("Enter Length and Breadth of the Rectangle: ");
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        sc.close();
        AreaofRectangle ar = new AreaofRectangle(length,breadth);
        ar.returnArea();
        
    }

    void returnArea(){
        double area = length * breadth;
        System.out.println("Area of a Rectangle is: " + area);
    }
}
