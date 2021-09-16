package com.programs.program7;

public class Sub extends Super{
    private int j=200;

    @Override
    void printNum() {
        super.printNum();
        System.out.println("The addition of i & j: "+(i+j));
        super.i=300;
        System.out.println("The value of i in Sub class: "+super.i);
        System.out.println("The value of j in Sub class:"+j);
        System.out.println("The addition of i & j: "+(i+j));
    }
}
