package com.programs.program2;

public class Child extends Parent{
    //Can't override as method is declared private in parent class
    public void display(){
        System.out.println("This is Child Class!!!");
        //super.display(); error=Visibility is private in parent class
    }
}
