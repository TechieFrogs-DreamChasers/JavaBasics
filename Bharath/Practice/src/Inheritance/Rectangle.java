package Inheritance;

public class Rectangle {

    double length;
    double breadth;

    void area(){

        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
    
    void perimeter(){

        double perimeter = (2 * (length*breadth));
        System.out.println("Perimeter Of Rectangle: "+ perimeter);

    }

    Rectangle(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    
}



