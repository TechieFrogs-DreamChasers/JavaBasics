package com.java8.practice.FI.LE;

public class DemoLambda {
    public static void main(String[] args) {

        IDemo iDemo = ()-> System.out.println("Hello");
        iDemo.show();

        IDemo iobj = ()-> System.out.println("World");
        iobj.show();

        IDemo_2 demo=(a,b)->a+b;
        System.out.println(demo.calculate(100,400));

        IDemo_2 iDemo_2 = (a,b)->a-b;
        System.out.println(iDemo_2.calculate(500,300));

        IDemo_2 iDemo2 = (a,b)->a*b;
        System.out.println(iDemo2.calculate(10,50));

        IDemo3 iDemo3 = (a,b)->a+b;
        System.out.println(iDemo3.perform_Calculation(10,90));

        IDemo3 demo3 = (a,b)->a*b;
        System.out.println(demo3.perform_Calculation(10,90));

        IstringOps sop = (a,b)->a.toLowerCase().concat(b.toUpperCase());
        System.out.println(sop.joinStrings("Java","Coding"));

        IShape circle = (rad,r) -> IShape.PI*rad*r;
        System.out.println("Area Of Circle: "+circle.calculateArea(5,5));

        IShape rectangle = (width,height) -> width*height;
        System.out.println("Area Of Rectangle: "+rectangle.calculateArea(10,5));

        IShape square = (width,height) -> width*height;
        System.out.println("Area Of Square: "+square.calculateArea(5,5));
    }
}
