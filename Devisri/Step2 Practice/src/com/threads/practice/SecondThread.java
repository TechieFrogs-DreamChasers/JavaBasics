package com.threads.practice;

public class SecondThread implements Runnable{

    @Override
    public void run() {
        Operations.executeIntegers(20);
    }
}
