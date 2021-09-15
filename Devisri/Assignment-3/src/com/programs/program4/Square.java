package com.programs.program4;

public class Square extends Rectangle {
    private double side;

    public Square(double side) {
        super(5, 10);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return cal_Area(side);
    }

    @Override
    public double getPerimeter() {
        return cal_Perimeter(side);
    }

    @Override
    public double cal_Area(double breadth, double height) {
        return super.cal_Area(breadth, height);
    }

    @Override
    public double cal_Perimeter(double breadth, double height) {
        return super.cal_Perimeter(breadth, height);
    }

    private double cal_Area(double side) {
        double area = side * side;
        return area;
    }

    private double cal_Perimeter(double side) {
        double perimeter = 4 * side;
        return perimeter;
    }
}
