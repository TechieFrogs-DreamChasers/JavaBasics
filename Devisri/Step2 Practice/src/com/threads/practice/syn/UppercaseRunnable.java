package com.threads.practice.syn;

public class UppercaseRunnable implements Runnable{
    @Override
    public void run() {
        DemoMethods.displayUpperCaseLetters("This Is Java Threads Program!!!");
    }
}
