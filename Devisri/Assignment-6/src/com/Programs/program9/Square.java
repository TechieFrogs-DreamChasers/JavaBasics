package com.Programs.program9;

public class Square implements Ishape {
    @Override
    public String getShapeName(String shape) {
        return shape;
    }

    @Override
    public String getTextOnShape(String text) {
        return text;
    }

    @Override
    public boolean textFitsShape(String text, double side) {
        if (text.length() > side)
            return false;
        else
            return true;
    }

    @Override
    public String getBackGroundColor(String color) {
        return color;
    }

    @Override
    public double getArea(double side) {
        return side * side;
    }

    @Override
    public double getArea(double length, double breadth) {
        return 0;
    }
}
