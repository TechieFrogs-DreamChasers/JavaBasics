package com.Practice.Exceptions;
/*
* An exception can be handled using try, catch, and finally blocks.
* We can handle multiple exceptions using multiple catch blocks.
* There can be a possibility for several exceptions inside the try block but at a time
only one exception will be raised.
* A single try block in Java can be followed by several catch blocks.
* A catch block cannot be without try block but a try block can have without catch block.
* We cannot write any statement between try and catch blocks.
* We can also write a try block within another try block that is called nested try blocks.
 */
public class MultiCatch {
    public static void main(String[] args) {
        String str="Mango";
        String num="10000";
        int number=Integer.parseInt(num);
        char[] chars=str.toCharArray();
        //Normal statement
        System.out.println(number);
        //Outer try block
        try {
            //Inner try+catch block for handling StringOutOfBounds
            try{
            System.out.println(str.charAt(5));
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println(str.charAt(4));
                System.out.println("Inside nested try block for String");
            }
            //Another Inner try+catch block for handling ArrayOutOfBounds
            try{
            System.out.println(chars[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(chars[1]);
                System.out.println("Inside nested try block for Array");
            }
            int number2=Integer.parseInt(str);
            //Directly goes to the Number Format catch block, here last block
            System.out.println(number2);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("RE-CHECK THE STRING LENGTH");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("RE-CHECK THE ARRAY INDEX");
        } catch (Exception e){
            System.out.println("NUMBER FORMAT EXCEPTION");
        }
        System.out.println("Out of the try+catch blocks");
        int num1=5;
        int num2=0;
        //Another try block for handling Arithmetic Exception
        try {
            System.out.println(num1/num2);
        }catch (ArithmeticException e){
            System.err.println("DIVIDE BY ZERO NOT POSSIBLE");
            //System.out.println("DIVIDE BY ZERO NOT POSSIBLE");
        }
        //Another try block for handling Null Pointer Exception
        String s=null;
        try{
            System.out.println(s.length());
        }catch (Exception e){
            System.err.println("NULL CAN'T HAVE LENGTH");
        }
        //Another try block for handling Negative Array Size Exception
        try{
            int[] ints=new int[-5];
            System.out.println(ints[-5]);
        } catch (NegativeArraySizeException e){
            System.err.println("ARRAY SIZE OR INDEX CAN'T BE < ZERO");
        }
        System.out.println("End of the program");

    }
}
/*
10000
o
Inside nested try block for String
a
Inside nested try block for Array
NUMBER FORMAT EXCEPTION
Out of the try+catch blocks
End of the program
DIVIDE BY ZERO NOT POSSIBLE
NULL CAN'T HAVE LENGTH
ARRAY SIZE OR INDEX CAN'T BE < ZERO
 */