package com.Practice.Exceptions;

public class Handling {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        //Exception Handling with Arithmetic Exception
        System.out.println("***Arithmetic Exception***");
        try{
            System.out.println("In try block: "+(a/b));
        } catch (ArithmeticException e) {
          // e.printStackTrace();
           //e.getMessage();
           System.out.println("CAN'T DIVIDE NUMBER BY 0");
        }
        System.out.println("After try+catch block: "+(a/(b+2)));
        //Exception Handling with StringIndexOutOfBoundsException
        System.out.println("***String Index Out Of Bounds Exception***");
        String s="Echo";
        String num="5000";
        try{
            System.out.println(s.charAt(4));
        } catch (StringIndexOutOfBoundsException e) {
            //e.printStackTrace();
            System.out.println("CHECK LENGTH OF THE STRING");
        }
        System.out.println("After try+catch block: "+s.charAt(3));
        //Exception Handling with NumberFormatException
        System.out.println("***NumberFormatException***");
        int number=Integer.parseInt(num);
        System.out.println(number);
        try {
            int number2=Integer.parseInt(s);
            System.out.println(number2);
        } catch (NumberFormatException e){
            System.out.println("NO NUMBER TO CONVERT IN THE STRING");
        }
        System.out.println("After Number Format Exception");
        //Exception Handling with ArrayIndexOutOfBoundsException
        System.out.println("***Array Index Out Of Bounds Exception***");
        char[] chars=s.toCharArray();
        try {
            System.out.println("In try block: "+chars[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("RE-CHECK THE INDEX OF ARRAY");
        }
        System.out.println("After try+catch block: "+chars[2]);
    }
}
/*
***Arithmetic Exception***
CAN'T DIVIDE NUMBER BY 0
After try+catch block: 5
***String Index Out Of Bounds Exception***
CHECK LENGTH OF THE STRING
After try+catch block: o
***NumberFormatException***
5000
NO NUMBER TO CONVERT IN THE STRING
After Number Format Exception
***Array Index Out Of Bounds Exception***
RE-CHECK THE INDEX OF ARRAY
After try+catch block: h
*/