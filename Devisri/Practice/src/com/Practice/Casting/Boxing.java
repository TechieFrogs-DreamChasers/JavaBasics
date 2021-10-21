package com.Practice.Casting;

public class Boxing {
    public static void main(String[] args) {
        byte b = 50;
        short s = 100;
        int i = 150;
        long l = 200l;
        float f = 250.5f;
        double d = 300.5;
        char c = 'A';
        boolean bol = true;
        Byte by = b;
        Short sh = s;
        Integer in = i;
        Long lo = l;
        Float fl = f;
        Double du = d;
        Character ch = c;
        Boolean bo = bol;
        System.out.println("The value of Byte = byte: " + by);
        System.out.println("The value of Short = short: " + sh);
        System.out.println("The value of Integer = integer: " + in);
        System.out.println("The value of Long = long: " + lo);
        System.out.println("The value of Float = float: " + fl);
        System.out.println("The value of Double = double: " + du);
        System.out.println("The value of Character = char: " + ch);
        System.out.println("The value of Boolean = boolean: " + bo);
        System.out.println("Passing and Returning With a Method");
        System.out.println("The Sum of two Integers: " + sum(50, 50));
    }

    static Integer sum(Integer num1, Integer num2) {
        int result = num1 + num2;
        return result;
    }
}
