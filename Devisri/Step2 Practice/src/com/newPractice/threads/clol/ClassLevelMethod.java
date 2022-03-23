package com.newPractice.threads.clol;

public class ClassLevelMethod implements Runnable{
    @Override
    public void run() {
        EvenOddNumbers.displayOddNumbers();
    }
}
