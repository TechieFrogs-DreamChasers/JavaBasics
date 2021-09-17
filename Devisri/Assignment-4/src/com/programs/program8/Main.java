package com.programs.program8;

public class Main {
    public static void main(String[] args) {
        Parent p=new Parent();
        //With obj it's not showing
        Parent.print();
        Child c=new Child();
        //With obj it's not showing
        Child.print();
        Parent parent= new Child();
        //With obj it's not showing

    }
}
