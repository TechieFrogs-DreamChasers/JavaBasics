package Assignment5;

public abstract class Shape {
    abstract double RectangleArea(double l,double b);
    abstract double SquareArea(double s);
    abstract double CircleArea(double r);
}
class Area extends Shape{
    final static double pi = 3.14;
    double RectangleArea(double l,double b){
        double area = l*b;
       return area;
        
    }
    double SquareArea(double s){
        double area = s*s;
        return area;
        
    }
    double CircleArea(double r){
        double area = pi*(r*r);
        return area;
    }
    public static void main(String[] args) {
        Area r = new Area();
        System.out.println("Area of Rectangle :"+r.RectangleArea(5.25, 6.50));
        
        Area s = new Area();
        System.out.println("Area of Square :"+ s.SquareArea(5));
    
       
        Area c = new Area();
        System.out.println("Area of Circle :"+c.CircleArea(5));
        
    }
}
