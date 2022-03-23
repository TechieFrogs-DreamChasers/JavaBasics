package com.threads.practice.syn;

public class MyThreadMain_3 {
    public static void main(String[] args) {
        MyThreadOps ops = new MyThreadOps();
        Thread t1 = new Thread(() -> ops.printingOddCubes((int) (Math.random()*10+1)));
        Thread t2 = new Thread(() -> ops.printingOddCubes((int) (Math.random()*10+1)));
        t1.start();
        t2.start();
    }
}
