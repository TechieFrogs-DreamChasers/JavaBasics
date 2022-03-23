package com.newPractice.threads.clol;

public class ClassLevelBlock implements Runnable{
    @Override
    public void run() {
        EvenOddNumbers.displayEvenNumbers();
    }
}
