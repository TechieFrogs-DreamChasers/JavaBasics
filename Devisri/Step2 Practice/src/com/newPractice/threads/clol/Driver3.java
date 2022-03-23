package com.newPractice.threads.clol;

public class Driver3 {
    public static void main(String[] args) {
       System.out.println(Thread.currentThread().getName()+" execution starts....");

        ObjectLevelMethod method = new ObjectLevelMethod();
        ObjectLevelMethod method2 = new ObjectLevelMethod();

        Thread t1 = new Thread(method);
        Thread t2 = new Thread(method);
        Thread t3 = new Thread(method2);
        Thread t4 = new Thread(method2);

        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");
        t4.setName("T4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println(Thread.currentThread().getName()+" execution ends....");
    }
}
