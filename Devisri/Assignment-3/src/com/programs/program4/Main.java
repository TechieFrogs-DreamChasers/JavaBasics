package com.programs.program4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of side: ");
        Square square = new Square(sc.nextDouble());
        System.out.println("The Area of Square: " + square.getArea());
        System.out.println("The Perimeter of Square: " + square.getPerimeter());
        System.out.println("Enter the length: ");
        double length = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the breadth: ");
        double breadth = sc.nextDouble();
        sc.nextLine();
        double area = square.cal_Area(breadth, length);
        double perimeter = square.cal_Perimeter(breadth, length);
        System.out.println("The Area of Rectangle: " + area);
        System.out.println("The Perimeter of Rectangle: " + perimeter);
        sc.close();
    }
}
