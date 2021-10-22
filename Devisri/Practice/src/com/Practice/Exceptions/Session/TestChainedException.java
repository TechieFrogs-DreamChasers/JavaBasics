package com.Practice.Exceptions.Session;

import java.io.IOException;
import java.util.Scanner;

public class TestChainedException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num1= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a Number: ");
        int num2= sc.nextInt();
        sc.nextLine();
        try{
        test_Chain(num1,num2);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }

    }
    static void test_Chain(int number1,int number2) throws Exception {

           /* ArithmeticException ae=new ArithmeticException("Shown to User:ArithmeticException Caught!!!");
            ae= (ArithmeticException) ae.initCause(new IOException("Actual Cause: Input is zero"));
            throw ae;*/
            try{
                if(number2==0){
                    throw new ArithmeticException("cause");
                }
                else{
                    System.out.println(number1/number2);
                }
            }catch (ArithmeticException e){
                try {
                    throw new IOException("Actual cause",e);
                } catch (IOException ex) {
                    //ex.printStackTrace();
                    throw new Exception("Another cause",ex);
                }
            }
        }
    }

