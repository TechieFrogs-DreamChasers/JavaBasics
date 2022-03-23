package com.newPractice.threads.clol;

public class Driver4 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+" starts....");

        //Thread.currentThread().getName().join();

        ObjectLevelBlock block = new ObjectLevelBlock();
        ObjectLevelBlock block2 = new ObjectLevelBlock();

        Thread t1 = new Thread(block);
        Thread t2 = new Thread(block);
        Thread t3 = new Thread(block2);
        Thread t4 = new Thread(block2);

        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");
        t4.setName("T4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println(Thread.currentThread().getName()+" ends....");
    }
}
