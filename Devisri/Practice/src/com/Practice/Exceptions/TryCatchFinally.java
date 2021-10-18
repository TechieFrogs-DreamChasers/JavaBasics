package com.Practice.Exceptions;

public class TryCatchFinally {
    public static void main(String[] args) {
        String str="Apple";
        String num="5000";
        try {
            //System.exit(0);
            int number=Integer.parseInt(num)+Integer.parseInt(str);
            System.out.println(number);
        }catch (NumberFormatException n){
            System.err.println("Non-Numeric String");
        } finally {
            System.out.println("Inside finally block");
            int number=Integer.parseInt(num)+Integer.parseInt(num);
            System.out.println(number);
        }
    }
}
/*
Non-Numeric String
Inside finally block
10000
 */