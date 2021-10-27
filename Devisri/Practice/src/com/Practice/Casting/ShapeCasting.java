package com.Practice.Casting;

public class ShapeCasting {
    String getShape() {
        return "Shape";
    }
}

class Square extends ShapeCasting {
    @Override
    String getShape() {
        return "Square";
    }

    double getPerimeter(double side) {
        return 4 * side;
    }

    double getArea(double side) {
        return side * side;
    }
}

class Circle extends ShapeCasting {
    static final double PI = 3.14;

    @Override
    String getShape() {
        return "Circle";
    }

    double getCircumference(double radius) {
        return 2 * PI * radius;
    }

    double getArea(double radius) {
        return PI * radius * radius;
    }
}

class MainCasting {
    public static void main(String[] args) {
        ShapeCasting sc = new Circle();
        ShapeCasting sc2 = new Square();
        display(sc);
        show(sc2);
    }

    private static void display(ShapeCasting sc) {
        //System.out.println(" ");
        if (sc instanceof Circle) {
            Circle circle = (Circle) sc;
            System.out.println("Shape: " + circle.getShape());
            System.out.println("Area: " + circle.getArea(15));
            System.out.println("Circumference: " + circle.getCircumference(15));
        } else {
            System.out.println("Not Instance Of Circle");
        }
    }

    private static void show(ShapeCasting sc) {
        if (sc instanceof Square) {
            Square square = (Square) sc;
            System.out.println("Shape: " + square.getShape());
            System.out.println("Area: " + square.getArea(15));
            System.out.println("Perimeter: " + square.getPerimeter(15));
        } else {
            System.out.println("Not Instance Of Square");
        }
    }
}