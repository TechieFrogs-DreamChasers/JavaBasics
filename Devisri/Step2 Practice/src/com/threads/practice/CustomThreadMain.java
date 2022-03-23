package com.threads.practice;

public class CustomThreadMain {
    public static void main(String[] args) throws InterruptedException {
        Runtime runtime = Runtime.getRuntime();
        runtime.addShutdownHook(new CustomThread());
        Thread.sleep(1000);
    }
}
