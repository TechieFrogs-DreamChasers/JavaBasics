package com.programs.program5;

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
    public double cal_Area(double length, double breadth) {
        return super.cal_Area(length, breadth);
    }

    private double cal_Area(double side) {
        return side * side;
    }
}
