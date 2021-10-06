package com.Practice.Interface.Shape;

public class Circle implements Polygon{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void getName() {
        System.out.println("Circle is a Polygon!!!");
    }

    @Override
    public void getNumberOfSides() {
        System.out.println("Circle has no sides !!!");
    }

    @Override
    public void getArea() {
        System.out.println("The area of circle is: "+(PI*radius*radius));
    }

    @Override
    public void getPerimeter() {
        System.out.println("The Circumference of Circle is: "+(2*PI*radius));
    }
}
