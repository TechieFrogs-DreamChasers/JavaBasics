package com.programs.program6;

public class Main {
    public static void main(String[] args) {
        Area area=new Area();
        System.out.println("The Area of Rectangle: "+area.area_Rectangle(10,5));
        System.out.println("The Area of Square: "+area.area_Square(5));
        System.out.println("The Area of Circle: "+area.area_Circle(5.5));
    }
}
