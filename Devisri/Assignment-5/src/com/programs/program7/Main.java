package com.programs.program7;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle("Blue",true,8.5);
        System.out.println(circle);
        System.out.println("The area of Circle: "+circle.get_Area());
        System.out.println("The Circumference of Circle: "+circle.get_Perimeter());
        System.out.println("**************************");
        Rectangle rectangle=new Rectangle("Purple",false,5.0,10.0);
        System.out.println(rectangle);
        System.out.println("The area of Rectangle: "+rectangle.get_Area());
        System.out.println("The Perimeter of Rectangle: "+rectangle.get_Perimeter());
        System.out.println("****************************");
        Square square=new Square("Yellow",true,5.0);
        System.out.println(square);
        System.out.println("The area of Square: "+square.get_Area());
        System.out.println("The Perimeter of Square: "+square.get_Perimeter());
    }
}
