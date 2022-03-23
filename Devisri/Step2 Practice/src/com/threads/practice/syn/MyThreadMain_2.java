package com.threads.practice.syn;

public class MyThreadMain_2 {
    public static void main(String[] args) {
        MyThreadOps ops = new MyThreadOps();
        Thread t1 = new Thread(()->ops.printingNumbers((int) (Math.random()*20+1)));
        Thread t2 = new Thread(()->ops.printingNumbers((int) (Math.random()*20+1)));
        t1.start();
        t2.start();
    }
}
