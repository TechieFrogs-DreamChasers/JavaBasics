package com.programs.program1;

public class Main {
    public static void main(String[] args) {
        PrintNumber pn = new PrintNumber();
        System.out.println("Same Data Types Addition: ");
        byte a = 2;
        byte b = 3;
        //byte+byte
        pn.printn(a, b);
        short c = 50;
        short d = 50;
        //short+short
        pn.printn(c, d);
        //int+int
        pn.printn(10, 20);
        //long+long
        pn.printn(1000l, 2000l);
        //float+float
        pn.printn(5.0f, 5.0f);
        //double+double
        pn.printn(10.52d, 10.52d);
        //char+char
        pn.printn('a', 'b');
        System.out.println("Different Data Types Addition: ");
        int e = 20;
        short f = 30;
        //int+short
        pn.printn(e, f);
        //byte+short
        pn.printn(a, c);
        //byte+long
        pn.printn(a, 2L);
        //float+double
        pn.printn(2.0f, 5.0d);
        //int+float
        pn.printn(5, 5.0f);
        //int+double
        pn.printn(5, 10.0d);
        //int+string
        pn.printn(5, "Hi");
        //string+int
        pn.printn("Hi", 10.0d);
    }
}
