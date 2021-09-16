package com.programs.program5;

public class Rectangle {
    private double length;
    private double breadth;
    private double area;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getArea() {
        return cal_Area(length, breadth);
    }

    public double cal_Area(double length, double breadth) {
        return length * breadth;
    }
}
