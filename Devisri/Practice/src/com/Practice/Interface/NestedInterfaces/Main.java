package com.Practice.Interface.NestedInterfaces;

public class Main {
    public static void main(String[] args) {
        System.out.println("Object Creation Using Sample3:");
        Sample3 sample3 = new Sample3();
        sample3.m1();
        sample3.m2();
        System.out.println(" ");
        System.out.println("Object Creation Using Sample2:");
        Sample2 sample2 = new Sample2();
        sample2.m2();
        System.out.println(" ");
        System.out.println("Object Creation Using Sample:");
        Sample sample = new Sample();
        sample.m1();
        System.out.println(" ");
        System.out.println("Object Creation Using Outer&Inner Interfaces:");
        //Outer outer;//Outer reference
        //new Sample();//Sample class implementing Outer
        //Now
        Outer outer = new Sample();
        outer.m1();
        System.out.println(" ");
        Outer.Inner inner1 = new Sample3();
        inner1.m2();
        System.out.println(" ");
        Outer.Inner inner2 = new Sample2();
        inner2.m2();
        System.out.println(" ");
        Outer outer1 = new Outer() {
            @Override
            public void m1() {
                System.out.println("This is anonymous Outer Interface Access of m1()");
            }
        };
        outer1.m1();

        Outer.Inner inner = new Outer.Inner() {
            @Override
            public void m2() {
                System.out.println("This is anonymous Inner Interface Access of m2()");
            }
        };
        inner.m2();
    }
}
