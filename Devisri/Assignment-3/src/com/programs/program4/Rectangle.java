package com.programs.program4;

public class Rectangle {
    private double breadth;
    private double height;
    private double area;
    private double perimeter;

    public Rectangle(double breadth, double height) {
        this.breadth = breadth;
        this.height = height;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return cal_Area(breadth, height);
    }

    public double getPerimeter() {
        return cal_Perimeter(breadth, height);
    }

    public double cal_Area(double breadth, double height) {
        double area = breadth * height;
        return area;
    }

    public double cal_Perimeter(double breadth, double height) {
        double perimeter = 2 * (breadth + height);
        return perimeter;
    }
}
