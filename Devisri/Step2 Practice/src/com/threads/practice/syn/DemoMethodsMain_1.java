package com.threads.practice.syn;

public class DemoMethodsMain_1 {
    public static void main(String[] args) {
        UppercaseRunnable up1 = new UppercaseRunnable();
        UppercaseRunnable up2 = new UppercaseRunnable();

        Thread t1 = new Thread(up1);
        Thread t2 = new Thread(up1);
        Thread t3 = new Thread(up2);
        Thread t4 = new Thread(up2);

        t1.setName("First Thread");
        t2.setName("Second Thread");
        t3.setName("Third Thread");
        t4.setName("Fourth Thread");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
