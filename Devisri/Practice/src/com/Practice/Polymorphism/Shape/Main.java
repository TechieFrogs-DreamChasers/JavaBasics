package com.Practice.Polymorphism.Shape;
//Driver Class
public class Main {
    public static void main(String[] args) {
        //creating obj for child class
        Triangle triangle=new Triangle(7,8,9);
        //printing the calculations
        System.out.println("The Area of Triangle First way: "+triangle.calc_Area(8,16));
        System.out.println("The Area of Triangle Second way: "+triangle.getArea());
        System.out.println("The Perimeter of Triangle: "+triangle.getPerimeter());
        /*
        The Area of Triangle First way: 64.0
        The Area of Triangle Second way: 26.832815729997478
        The Perimeter of Triangle: 24.0
        */
    }
}
