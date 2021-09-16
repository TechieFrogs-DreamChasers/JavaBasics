package com.programs.program2;

public class PrintOverload {
    void print(int a, char b) {
        System.out.println(a + "    " + b + "   " + (a + b));
    }

    void print(char a, int b) {
        System.out.println(a + "    " + b + "   " + (a + b));
    }
}
