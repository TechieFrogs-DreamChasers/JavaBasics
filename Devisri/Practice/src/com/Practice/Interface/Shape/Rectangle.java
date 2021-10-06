package com.Practice.Interface.Shape;

public class Rectangle implements Polygon{
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void getName() {
        System.out.println("Rectangle is a Polygon!!!");
    }

    @Override
    public void getNumberOfSides() {
        System.out.println("Rectangle has 4 sides !!!");
    }

    @Override
    public void getArea() {
        System.out.println("The area of rectangle is: "+(length*breadth));
    }

    @Override
    public void getPerimeter() {
        System.out.println("The Perimeter of rectangle is: "+(2*(length+breadth)));
    }
}
