package Methods.Third;

public class Area {

    void area(double length, double breadth) {
        double area = length * breadth;
        System.out.println("The area of Rectangle: " + area);
    }

    void area(double side) {
        double area = side * side;
        System.out.println("The area of Square: " + area);
    }
    
}

class Main{

    public static void main(String[] args) {
        Area x1 = new Area();
        x1.area(20, 5);
        x1.area(15);
    }
}
