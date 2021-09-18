package AbstractClassAssignmt;

import java.util.Scanner;

public abstract class Shape {
    int len,breadth,side,radius;
    public abstract int rectangleArea(int len,int breadth);
    public abstract int squareArea(int side);
    public abstract double circleArea(int radius);
}

class Area extends Shape{
    public int rectangleArea(int len, int breadth){
        int area = len*breadth;
        return area;
    }
    
    public int squareArea(int side){
        int area = side*side;
        return area;
    }

    public double circleArea(int radius){
        double area = 3.14 * radius *radius;
        return area;
    }

    public static void main(String[] args){
        Area ar = new Area();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter length and breadth: ");
        int len = obj.nextInt();
        int breadth = obj.nextInt();
        System.out.println("Enter side of square: ");
        int side = obj.nextInt();
        System.out.println("Enter radius: ");
        int radius = obj.nextInt();
        obj.close();

        System.out.println("Area of rectangle : "+ ar.rectangleArea(len, breadth));
        System.out.println("Area of circle: " + ar.circleArea(radius));
        System.out.println("Area of square: "+ ar.squareArea(side));
    }
}
