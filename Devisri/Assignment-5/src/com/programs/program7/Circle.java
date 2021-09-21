package com.programs.program7;

public class Circle extends Shape {
    private static final double PI=3.14;
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    protected double get_Area() {
        return PI*radius*radius;
    }

    @Override
    protected double get_Perimeter() {
        return 2*PI*radius;
    }

    @Override
    public String toString() {
        return "Circle[Shape color: "+getColor()+", is filled: "+isFilled()+"], radius: "+getRadius();
    }
}
