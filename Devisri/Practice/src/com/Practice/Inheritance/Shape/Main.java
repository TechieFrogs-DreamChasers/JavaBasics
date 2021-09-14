package com.Practice.Inheritance.Shape;

public class Main {
    public static void main(String[] args) {
        /*Shape shape=new Shape(5,15);
        System.out.println(shape.getWidth()+"  "+shape.getHeight());*/
        Rectangle rectangle=new Rectangle(5,10);
        System.out.println("The Area of Rectangle: "+rectangle.getArea());//50
        System.out.println("The Perimeter of Rectangle: "+rectangle.getPerimeter());//30
        Square square=new Square(5);
        //This goes to square class overloaded method
        System.out.println("The Area of Square: "+square.getArea());//25
        System.out.println("The Perimeter of Square: "+square.getPerimeter());//20
        //This goes to square class override method and then calculates in Rectangle class method
        double sq_Area=square.calcArea(5,5);
        double sq_Perimeter=square.calcPerimeter(5,5);
        System.out.println("The Area of Square: "+sq_Area);//25
        System.out.println("The Perimeter of Square: "+sq_Perimeter);//20

    }
}
