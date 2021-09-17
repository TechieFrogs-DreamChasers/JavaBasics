package com.Practice.Inheritance.Shape;
//Multi level Inheritance
public class Shape {
    private double height;
    private double width;

    public Shape(double height, double width) {
        System.out.println("Parent Class-->Shape-->Shape(parameters)");
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double calcArea(double width,double height){
        double area=0;
        return area;
    }

    public double calcPerimeter(double width,double height){
        double perimeter=0;
        return perimeter;
    }

}
