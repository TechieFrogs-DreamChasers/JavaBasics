package com.Practice.Interface.Shape;

public class Main {
    public static void main(String[] args) {
        Circle c=new Circle(5.0);
        c.getName();
        c.getNumberOfSides();
        c.getArea();
        c.getPerimeter();
        System.out.println(" ");
        Rectangle r=new Rectangle(5,10);
        r.getName();
        r.getNumberOfSides();
        r.getArea();
        r.getPerimeter();
        System.out.println(" ");
        Square s=new Square(8);
        s.getName();
        s.getNumberOfSides();
        s.getArea();
        s.getPerimeter();

    }
}
