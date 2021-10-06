package Assignment3.Exercise4;

public class Square extends Rectangle {

    int side;

   Square(int side,double length,double breadth){

        super(length,breadth);
        this.side = side;
        
    }

    void area(){

        double area;
        area = (side * side);
        System.out.println("Area of a Square:  " + area);
    }

    void perimeter(){

        double perimeter;
        perimeter = (4 * side);
        System.out.println("Perimeter Of the Square: " + perimeter);
    }

    
    
}
