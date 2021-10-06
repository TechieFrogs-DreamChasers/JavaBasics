package com.Practice.Polymorphism.Shape;

//Child class Triangle extends from Parent Class Shape
//step1: declaring variables accordingly to Triangle
public class Triangle extends Shape {
    private int side1;
    private int side2;
    private int side3;

    //step2: Constructor with parameters.
    //We have a default constructor in parent class. So no need of Explicit Constructor chaining
    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //Step3: Overriding getArea(),getPerimeter(),calc_Area(parameters),calc_Perimeter(parameters)
    //step8: returning step4 double result in this
    @Override
    public double getArea() {
        return calc_Area(side1, side2, side3);
    }

    //step9: returning step7 int type result in this. int is less than double so it accepts
    @Override
    public double getPerimeter() {
        return calc_Perimeter(side1, side2, side3);
    }

    //step4: adding code to overridden method accordingly for child class requirements
    @Override
    double calc_Area(double base, double height) {
        return 0.5 * base * height;
    }

    //step5: I don't need this method signature. I did override this method for overloading
    @Override
    double calc_Perimeter(double base, double height) {
        return 0;
    }

    //step6: overloaded calc_Area(changed the parameters as per requirement)
    private double calc_Area(int side1, int side2, int side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));
    }

    //step7: overloaded calc_Perimeter(changed the parameters as requirement)& changed return type
    private int calc_Perimeter(int side1, int side2, int side3) {
        return side1 + side2 + side3;
    }
}
