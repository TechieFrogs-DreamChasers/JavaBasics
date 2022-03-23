package com.newPractice.threads.priorities;

public class Driver {
    public static void main(String[] args) {
        DisplayListContents dl = new DisplayListContents();
        DisplayListContents dl2 = new DisplayListContents();

        Thread t1 = new Thread(dl);
        Thread t2 = new Thread(dl);
        Thread t3 = new Thread(dl2);
        Thread t4 = new Thread(dl);
        Thread t5 = new Thread(dl2);

        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");
        t4.setName("T4");
        t5.setName("T5");

        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(6);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(9);
        t5.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}
