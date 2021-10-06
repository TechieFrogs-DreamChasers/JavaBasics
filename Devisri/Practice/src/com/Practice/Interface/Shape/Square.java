package com.Practice.Interface.Shape;

public class Square implements Polygon{
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void getName() {
        System.out.println("Square is a Polygon!!!");
    }

    @Override
    public void getNumberOfSides() {
        System.out.println("Rectangle has 4 sides !!!");
    }

    @Override
    public void getArea() {
        System.out.println("The area of a square: "+(side*side));
    }

    @Override
    public void getPerimeter() {
        System.out.println("The perimeter of a square: "+(4*side));
    }
}
