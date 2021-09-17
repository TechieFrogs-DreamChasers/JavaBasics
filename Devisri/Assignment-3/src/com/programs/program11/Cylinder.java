package com.programs.program11;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double get_Volume(double height) {
        return PI * getRadius() * getRadius() * height;
    }

    @Override
    public double get_Area(double radius) {
        System.out.println("The Area of Circle: "+super.get_Area(radius));
        return 2 * PI * getRadius() * (getRadius() + height);
    }
}
