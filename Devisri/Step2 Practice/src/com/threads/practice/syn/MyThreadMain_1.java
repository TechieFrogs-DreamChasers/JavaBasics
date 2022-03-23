package com.threads.practice.syn;

public class MyThreadMain_1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> MyThreadOps.printingCharacters("Cherishing"));
        Thread t2 = new Thread(() -> MyThreadOps.printingCharacters("Enjoying"));
        t1.start();
        t2.start();
    }
}
