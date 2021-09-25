package com.Programs.program9;

public class Rectangle implements Ishape {
    @Override
    public String getShapeName(String shape) {
        return shape;
    }

    @Override
    public String getTextOnShape(String text) {
        return text;
    }

    @Override
    public boolean textFitsShape(String text, double breadth) {
        if (text.length() > breadth)
            return false;
        else
            return true;
    }

    @Override
    public String getBackGroundColor(String color) {
        return color;
    }

    @Override
    public double getArea(double radius) {
        return 0;
    }

    @Override
    public double getArea(double length, double breadth) {
        return length * breadth;
    }
}
