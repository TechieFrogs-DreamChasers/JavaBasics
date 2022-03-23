package com.threads.practice;

public class CustomThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is Shutting down!!!");
    }
}
