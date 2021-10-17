package com.Practice.Exceptions;

public class Extra {
    public static void main(String[] args) {
        try{
            getStringLength();
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Re-Thrown Exception: "+e);
        }
        try{
            getDivision();
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Re-Thrown Exception: "+e);
        }
        System.out.println("After try catch");
    }
    static void getStringLength(){
        try{
            String text=null;
            int length=text.length();
        } catch (NullPointerException e) {
            System.out.println("Exception Thrown: "+e);
            throw e;
        }
    }
    static void getDivision(){
        try{
            int num1=5;
            int num2=0;
            System.out.println(num1/num2);
        }catch (ArithmeticException e){
            System.out.println("Thrown Exception: "+e);
            throw e;
        }
       // System.out.println("After try catch");
    }
}
/*
Exception Thrown: java.lang.NullPointerException: Cannot invoke "String.length()" because "text" is null
Re-Thrown Exception: java.lang.NullPointerException: Cannot invoke "String.length()" because "text" is null
Thrown Exception: java.lang.ArithmeticException: / by zero
Re-Thrown Exception: java.lang.ArithmeticException: / by zero
*/