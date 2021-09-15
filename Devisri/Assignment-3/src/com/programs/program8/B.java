package com.programs.program8;

public class B extends A{
    private int k;

    public B(int k) {
        super(100, 200);
        this.k=k;
    }

    @Override
    public void show() {
        System.out.println("k = "+k);
        //super.show();
    }
}
