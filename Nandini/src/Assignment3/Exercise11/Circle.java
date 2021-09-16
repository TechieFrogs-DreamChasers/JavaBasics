package Assignment3.Exercise11;

public class Circle {
    
    public final double PI = 3.14;
    private double radius;
    private String color;
    double area;

    Circle(){

    }

    Circle(double radius){
        this.radius = radius;
    }

    Circle(double radius,String color){

        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public double getArea(){
        System.out.println("Area of Circle is: ");
        return (PI*radius*radius);
    }


    public String toString(){
       return "Circle[radius=r,color=c]";
    }
}
