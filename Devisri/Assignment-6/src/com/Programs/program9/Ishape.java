package com.Programs.program9;

public interface Ishape {
    double pi = 3.14;

    String getShapeName(String shape);

    String getTextOnShape(String text);

    boolean textFitsShape(String text, double radius);

    String getBackGroundColor(String color);

    double getArea(double radius);

    double getArea(double length, double breadth);
}
