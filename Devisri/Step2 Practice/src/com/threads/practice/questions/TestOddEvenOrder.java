package com.threads.practice.questions;

public class TestOddEvenOrder {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread-1: ");
        Runnable r1 = ()->{
            for(int i=1;i<=10;i++){
                if(i%2!=0)
                    System.out.println(i);
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
        t1.join();
        System.out.println("Thread-2: ");
        Runnable r2 = ()->{
            for(int i=1;i<=10;i++){
                if(i%2==0)
                    System.out.println(i);
            }
        };
        Thread t2 = new Thread(r2);
        t2.start();
        t2.join();
    }
}
