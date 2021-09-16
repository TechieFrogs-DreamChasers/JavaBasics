package com.Practice.Polymorphism.Shape;

//Parent class Shape
//step1:
public class Shape {
    private double base;
    private double height;
    private double area;
    private double perimeter;

    public Shape() {

    }

    //step2: Constructor with parameters
    public Shape(double base, double height) {
        this.base = base;
        this.height = height;
    }

    //step 3:getters for Area & Perimeter
    public double getArea() {
        return calc_Area(base, height);
    }

    public double getPerimeter() {
        return calc_Perimeter(base, height);
    }

    //step4: Methods for area & perimeter for overriding
    double calc_Area(double base, double height) {
        return 0;
    }

    double calc_Perimeter(double base, double height) {
        return 0;
    }
}
