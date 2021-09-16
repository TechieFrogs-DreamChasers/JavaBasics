package com.programs.program1;
//Method & Operator overloading with implicit type Promotions
public class PrintNumber {

    void printn(byte a, byte b) {
        System.out.println("The sum of two byte numbers: " + (a + b));
    }

    void printn(short a, short b) {
        System.out.println("The sum of two short numbers: " + (a + b));
    }

    void printn(int a, int b) {
        System.out.println("The sum of two Integers: " + (a + b));
    }

    void printn(long a, long b) {
        System.out.println("The sum of two long numbers: " + (a + b));
    }

    void printn(float a, float b) {
        System.out.println("The sum of two float numbers: " + (a + b));
    }

    void printn(double a, double b) {
        System.out.println("The sum of two double numbers: " + (a + b));
    }

    void printn(char a, char b) {
        System.out.println("The sum of two char: " + (a + b));
    }

    void printn(int a, short b) {
        System.out.println("The sum of int and short numbers: " + (a + b));
    }

    void printn(byte a, short b) {
        System.out.println("The sum of byte and short numbers: " + (a + b));
    }

    void printn(byte a, long b) {
        System.out.println("The sum of byte and long numbers: " + (a + b));
    }

    void printn(float a, double b) {
        System.out.println("The sum of float and double numbers: " + (a + b));
    }

    void printn(int a, float b) {
        System.out.println("The sum of int and float numbers: " + (a + b));
    }

    void printn(int a, double b) {
        System.out.println("The sum of int and double numbers: " + (a + b));
    }

    void printn(int a, String b) {
        System.out.println("The sum of float and double numbers: " + (a + b));
    }

    void printn(String a, double b) {
        System.out.println("The sum of float and double numbers: " + (a + b));
    }

}
