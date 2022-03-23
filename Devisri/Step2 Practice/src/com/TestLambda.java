package com;

import java.io.IOException;

interface MyTestFunctional{
    void ageChecker(int age) throws ArithmeticException;
}
interface MyDemoFunctional {
    void checkingCheckedException(String message) throws IOException;
}
public class TestLambda{
    public static void main(String[] args) throws IOException {
        MyTestFunctional mf = (age)->{
            if(age < 1)
                throw new ArithmeticException("Age can't be < 0");
            else
                System.out.println("Age is Valid!!!");
        };
        mf.ageChecker(18);
       // mf.ageChecker(0);
        MyDemoFunctional md = (message)->{
            throw new IOException("Checking....");
        };
       // md.checkingCheckedException("Message Check!!!");
        display();
    }
    public static void display() throws IOException {
        //try {
            throw new IOException("Display method!!!");
        //} catch (IOException e){
          //  System.out.println(e.getMessage());
        //}
    }
}
