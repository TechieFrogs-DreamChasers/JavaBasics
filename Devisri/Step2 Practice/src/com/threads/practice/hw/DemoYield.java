package com.threads.practice.hw;

public class DemoYield implements Runnable{
    @Override
    public void run() {
        System.out.println(">>> "+Thread.currentThread());
        Thread.yield();
        System.out.println("<<< "+Thread.currentThread());
    }
    public static void main(String[] args) {
        DemoYield demoYield1 = new DemoYield();
        Thread t1 = new Thread(demoYield1,"First Thread");
        DemoYield demoYield2 = new DemoYield();
        Thread t2 = new Thread(demoYield2,"Second Thread");
        t1.setPriority(5);
        t2.setPriority(10);
        t1.start();
        t2.start();
    }
}
