package com.Practice.Inheritance.Shape;

public class Rectangle extends Shape {
    private double area;
    private double perimeter;

    public Rectangle(double height, double width) {
        super(height, width);
        System.out.println("Parent Class-->Shape-->Child Class-->Rectangle-->Rectangle(parameters)");
    }

    public double getArea() {
        System.out.println("Parent Class-->Shape-->Child Class-->Rectangle-->getArea()");
        return calcArea(getWidth(),getHeight());
    }

    public double getPerimeter() {
        System.out.println("Parent Class-->Shape-->Child Class-->Rectangle-->getPerimeter()");
        return calcPerimeter(getWidth(),getHeight());
    }
    @Override
    public double calcArea(double width,double height){
        System.out.println("Parent Class-->Shape-->Child Class-->Rectangle-->calcArea()");
        double area=width*height;
        return area;
    }
    @Override
    public double calcPerimeter(double width,double height){
        System.out.println("Parent Class-->Shape-->Child Class-->Rectangle-->calcPerimeter()");
        double perimeter=2*(width+height);
        return perimeter;
    }


}
