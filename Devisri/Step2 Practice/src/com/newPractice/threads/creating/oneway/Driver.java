package com.newPractice.threads.creating.oneway;

public class Driver {
    public static void main(String[] args) throws InterruptedException {
        EvenThread et = new EvenThread();
        et.setName("Even_Thread-1");
        EvenThread et2 = new EvenThread();
        et2.setName("Even_Thread-2");
        et.start();
        et.join();
        et2.start();
    }
}
