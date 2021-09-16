package com.programs.program3;

public class AreaOfTwoShapes {
    void area(double length, double breadth) {
        double area = length * breadth;
        System.out.println("The area of Rectangle: " + area);
    }

    void area(double side) {
        double area = side * side;
        System.out.println("The area of Square: " + area);
    }
}
