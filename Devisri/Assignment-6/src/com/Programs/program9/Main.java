package com.Programs.program9;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle();
        String text=circle.getTextOnShape("Parking On Right");
        System.out.println("Shape of sign: "+circle.getShapeName("Circle"));
        System.out.println("Color of Sign board: "+circle.getBackGroundColor("White"));
        System.out.println("Text on Sign board: "+text);
        System.out.println("Does Text fit On Shape: "+circle.textFitsShape(text,25.0));
        System.out.println("The area of sign board's Shape: "+circle.getArea(25.0));
        System.out.println(" ");
        Rectangle rectangle=new Rectangle();
        String warning="Drive Slow";
        System.out.println("Shape of sign: "+rectangle.getShapeName("Rectangle"));
        System.out.println("Color of Sign board: "+rectangle.getBackGroundColor("Orange"));
        System.out.println("Text on Sign board: "+rectangle.getTextOnShape(warning));
        System.out.println("Does Text fit On Shape: "+rectangle.textFitsShape(warning,25.0));
        System.out.println("The area of sign board's Shape: "+rectangle.getArea(15,25));
        System.out.println(" ");
        Square square=new Square();
        String enjoy="Gym On Left";
        System.out.println("Shape of sign: "+square.getShapeName("Square"));
        System.out.println("Color of Sign board: "+square.getBackGroundColor("Grey"));
        System.out.println("Text on Sign board: "+square.getTextOnShape(enjoy));
        System.out.println("Does Text fit On Shape: "+square.textFitsShape(enjoy,15));
        System.out.println("The area of sign board's Shape: "+square.getArea(15));
    }
}
