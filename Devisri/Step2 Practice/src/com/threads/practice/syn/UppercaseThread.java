package com.threads.practice.syn;

public class UppercaseThread extends Thread{
    @Override
    public void run() {
        DemoMethods.displayUpperCaseLetters("Static Synchronization In Threads Java");
    }
}
