package com.Practice.Exceptions;

import java.io.IOException;

public class ParentChild {
     void display() throws IOException{
        throw new IOException("IOException Thrown!!!");
     }
     void show() {
         System.out.println("This is normal show() statement");
     }
     void details() throws ArithmeticException{
         throw new ArithmeticException("Arithmetic Exception Thrown!!!");
     }
}
class Child extends ParentChild{
    public static void main(String[] args) {
        Child child=new Child();
        try {
            child.display();
        } catch (ArithmeticException | IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    void display() throws IOException,ArithmeticException{
        //super.display();
        throw new ArithmeticException("Can't divide by Zero");
    }

    /*@Override
    void show() throws IOException,ArithmeticException{
        super.show();
    }

    @Override
    void details() throws ArithmeticException,ArrayIndexOutOfBoundsException,IOException {
        super.details();
    }*/
}