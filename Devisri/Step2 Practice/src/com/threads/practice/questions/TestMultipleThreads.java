package com.threads.practice.questions;

public class TestMultipleThreads {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread-1");
        Runnable runnable = ()->{
            if (Thread.currentThread().getName().equals("Thread-0")) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                    i+=2;
                }
            }else if (Thread.currentThread().getName().equals("Thread-1")) {
                for (int i = 2; i <= 10; i++) {
                    System.out.println(i);
                    i+=2;
                }
            }else if (Thread.currentThread().getName().equals("Thread-2")) {
                for (int i = 3; i <= 10; i++) {
                    System.out.println(i);
                    i+=2;
                }
            }
        };
        Thread t1 = new Thread(runnable);
        t1.start();
        t1.join();
        System.out.println("Thread-2");
        Thread t2 = new Thread(runnable);
        t2.start();
        t2.join();
        System.out.println("Thread-3");
        Thread t3 = new Thread(runnable);
        t3.start();
        t3.join();
    }
}
