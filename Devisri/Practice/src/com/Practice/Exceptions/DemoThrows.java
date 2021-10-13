package com.Practice.Exceptions;
import java.util.Arrays;
//Throws+Methods
public class DemoThrows {
    public static void main(String[] args) throws Exception{
        int[] ints=new int[5];
        try{
            for(int i=0;i<6;i++){
                ints[i]=i;
            }
            System.out.println(Arrays.toString(ints));
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Fill in: "+e.fillInStackTrace());
            System.out.println("Cause: "+e.getCause());
            System.out.println("Local: "+e.getLocalizedMessage());
            System.out.println("Message: "+e.getMessage());
            System.out.println("Trace: "+e.getStackTrace());
            System.out.println(" ");
            System.out.println("Trace: ");
            System.out.println(" ");
            e.getStackTrace();
            System.out.println(" ");
            System.out.println("String: ");
            System.out.println(e.toString());
            System.out.println(" ");
            System.out.println("This is Catch Block!!!");
            throw(Exception) new Exception().initCause(e);
        } finally {
            System.out.println(Arrays.toString(ints));
        }
    }
}
/*
Fill in: java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
Cause: null
Local: Index 5 out of bounds for length 5
Message: Index 5 out of bounds for length 5
Trace: [Ljava.lang.StackTraceElement;@4eec7777

Trace:


String:
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

This is Catch Block!!!
[0, 1, 2, 3, 4]
Exception in thread "main" java.lang.Exception
	at com.Practice.Exceptions.DemoThrows.main(DemoThrows.java:27)
Caused by: java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	at com.Practice.Exceptions.DemoThrows.main(DemoThrows.java:13)
 */