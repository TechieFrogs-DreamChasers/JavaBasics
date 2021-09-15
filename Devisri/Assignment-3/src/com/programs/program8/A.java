package com.programs.program8;

public class A {
    private int i;
    private int j;

    public A(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public void show(){
        System.out.println("i = "+i+"  "+" j = "+j);
    }
}
