package com.threads.practice;

public class DemoThreadsMain {
    public static void main(String[] args) {
        Thread thread = new Thread(new DemoThreads());
        thread.start();
    }
}
