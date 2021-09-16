package Assignment3.Exercise5;

public class Square extends Rectangle {
    
    int side;

   Square(int side){

        super(5,5);
        this.side = side;
        
    }

    public double getArea(){
        return area();

    }

    
    public double area(){

        double area;
        area = (side * side);
        System.out.println( area);
        return area;
    }

    void perimeter(){

        double perimeter;
        perimeter = (4 * side);
        System.out.println("Perimeter Of the Square: " + perimeter);
    }
}
