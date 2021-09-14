package com.Practice.Inheritance.Shape;

public class Square extends Rectangle {
    private double side;
    public Square(double side) {
        super(6, 12);
        this.side=side;
    }

    @Override
    public double getArea() {
        return calcArea(side);
    }

    @Override
    public double getPerimeter() {
        return calcPerimeter(side);
    }

    @Override
    public double calcArea(double width, double height) {
        return super.calcArea(width, height);
    }

    @Override
    public double calcPerimeter(double width, double height) {
        return super.calcPerimeter(width, height);
    }
    //overload
   private double calcArea(double side) {
        double area=side*side;
        return area;
    }

    //overload
    private double calcPerimeter(double side) {
        double perimeter=4*side;
        return perimeter;
    }
}
