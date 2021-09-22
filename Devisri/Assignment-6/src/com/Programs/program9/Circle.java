package com.Programs.program9;

public class Circle implements Ishape {
    @Override
    public String getShapeName(String shape) {
        return shape;
    }

    @Override
    public String getTextOnShape(String text) {
        return text;
    }

    @Override
    public boolean textFitsShape(String text, double radius) {
        if (text.length() > radius) {
            //System.out.println(text.length());
            return false;
        } else {
            //System.out.println(text.length());
            return true;
        }

    }

    @Override
    public String getBackGroundColor(String color) {
        return color;
    }

    @Override
    public double getArea(double radius) {
        return pi * radius * radius;
    }

    @Override
    public double getArea(double length, double breadth) {
        return 0;
    }
}
