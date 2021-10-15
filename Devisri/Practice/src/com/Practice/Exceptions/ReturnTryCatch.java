package com.Practice.Exceptions;

public class ReturnTryCatch {
    static int check(){
        try{
            System.out.println("This is try block");
            return 500;
        }catch (Exception e){
            System.out.println("This is catch block");
        }
        return 1000;
    }
    static int check2(){
        try{
            System.out.println("Inside try block");
            int num=10/0;
            return 500;
        }catch (ArithmeticException e){
            System.out.println("Inside catch block");
            return 1000;
        } finally {
            System.out.println("Inside Finally block");
            return 1500;
        }
    }
    public static void main(String[] args) {
        int result=check();
        System.out.println(result);
        System.out.println(" ");
        int temp=check2();
        System.out.println(temp);
    }
}
/*
This is try block
500

Inside try block
Inside catch block
Inside Finally block
1500
*/