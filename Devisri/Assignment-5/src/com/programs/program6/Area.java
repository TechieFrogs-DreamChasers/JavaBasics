package com.programs.program6;

public class Area extends Shape{
    private static final double PI=3.14;
    @Override
    public double area_Rectangle(double breadth, double height) {
        return breadth*height;
    }

    @Override
    public double area_Square(double side) {
        return side*side;
    }

    @Override
    public double area_Circle(double radius) {
        return PI*radius*radius;
    }
}
