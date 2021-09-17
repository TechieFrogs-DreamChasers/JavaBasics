package com.programs.program7;
/*
Output:
The value of i in super class is: 100
The addition of i & j: 300
The value of i in Sub class: 300
The value of j in Sub class:200
The addition of i & j: 500
*/
public class Main {
    public static void main(String[] args) {
        Sub sub=new Sub();
        sub.printNum();
    }
}
