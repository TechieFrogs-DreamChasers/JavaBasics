package com.Practice.Casting;

public class UnBoxing {
    public static void main(String[] args) {
        Byte by = 100;
        Short sh = 500;
        Integer in = 1000;
        Long lo = 15000L;
        Float fl = 25000.0f;
        Double du = 50000.5;
        Character ch = 'C';
        Boolean bo = true;
        byte b = by.byteValue();
        short s = sh.shortValue();
        int i = in.intValue();
        long l = lo.longValue();
        float f = fl.floatValue();
        double d = du.doubleValue();
        char c = ch.charValue();
        boolean bol = bo.booleanValue();
        byte n1 = by;
        short n2 = sh;
        int n3 = in;
        long n4 = lo;
        float n5 = fl;
        double n6 = du;
        char cha = ch;
        boolean bool = bol;
        System.out.println("The value of byte = Byte: " + n1);
        System.out.println("The value of short = Short: " + n2);
        System.out.println("The value of int = Integer: " + n3);
        System.out.println("The value of long = Long: " + n4);
        System.out.println("The value of float = Float: " + n5);
        System.out.println("The value of double = Double: " + n6);
        System.out.println("The value of char = Character: " + cha);
        System.out.println("The value of boolean = Boolean: " + bool);
        System.out.println(" ");
        System.out.println("The value of byte = by.byteValue(): " + b);
        System.out.println("The value of short = sh.shortValue(): " + s);
        System.out.println("The value of int = in.intValue(): " + i);
        System.out.println("The value of long = lo.longValue(): " + l);
        System.out.println("The value of float = fl.floatValue(): " + f);
        System.out.println("The value of double = du.doubleValue(): " + d);
        System.out.println("The value of char = ch.charValue(): " + c);
        System.out.println("The value of boolean = bo.booleanValue(): " + bol);
        System.out.println("Passing and Returning With a Method");
        System.out.println("The Product of two Integers: " + product(in, in));
    }

    static int product(int num1, int num2) {
        Integer result = num1 * num2;
        return result;
    }
}
