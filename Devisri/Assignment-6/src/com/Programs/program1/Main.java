package com.Programs.program1;

public class Main {
    public static void main(String[] args) {
        IRegularPolygon irp = new IRegularPolygon() {
            @Override
            public double getNumSides() {
                return 5;
            }

            @Override
            public double getSideLength(double n) {
                return n;
            }
        };
        System.out.println("The Number of Sides in a Pentagon: " + irp.getNumSides());
        System.out.println("The side length of Pentagon: " + irp.getSideLength(7));
        System.out.println("The Perimeter of Pentagon: " + irp.getPerimeter(7));
        System.out.println("The Sum of Interior Angles of a Pentagon: " + irp.getInteriorAngle(5));
        double[] number = {900.0, 700.0, 500.0, 600.0, 800.0};
        System.out.println("The Total Sum of Sides: " + IRegularPolygon.totalSides(number));
        System.out.println(" ");
        EquilateralTriangle et = new EquilateralTriangle();
        System.out.println("The Number of Sides in an Equilateral Triangle: " + et.getNumSides());
        System.out.println("Side Length of an Equilateral Triangle: " + et.getSideLength(6));
        System.out.println("Perimeter Of an Equilateral Triangle: " + et.getPerimeter(6));
        System.out.println("The Sum of Interior Angles of an Equilateral Triangle: " + et.getInteriorAngle(3));
        System.out.println(" ");
        Square sq = new Square();
        System.out.println("The Number of Sides in a Square: " + sq.getNumSides());
        System.out.println("The side length of square: " + sq.getSideLength(5));
        System.out.println("The Perimeter of Square: " + sq.getPerimeter(5));
        System.out.println("The Sum of Interior Angles of a Square: " + sq.getInteriorAngle(4));


    }
}
