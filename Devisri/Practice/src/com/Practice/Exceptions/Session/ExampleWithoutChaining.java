package com.Practice.Exceptions.Session;

public class ExampleWithoutChaining {
    public static void main(String[] args) {
        try {
            //Step 1
            code1();
        } catch (NullPointerException e) {
            //Step 7
            e.printStackTrace();
        }
    }
    static void code1() throws NullPointerException {
        try {
            //Step 2
            code2();
        }catch (Exception e){
            //e.printStackTrace();
            //Step 6
            throw new NullPointerException("Exception thrown in code1() method!!!");
        }
    }
    static void code2() throws ArithmeticException {
        try {
            //Step 3
            code3();
        }catch (Exception e){
            //e.printStackTrace();
            //Step 5
            throw new ArithmeticException("Exception thrown in code2() method!!!");
        }
    }
    static void code3() throws Exception {
        //Step 4
        throw new Exception("Exception thrown in code3() method!!!");
    }
}
