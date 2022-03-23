package com.threads.practice.syn;

public class SquaresRunnable implements Runnable{
    @Override
    public void run() {
        DemoMethods demo = new DemoMethods();
        demo.displayEvenSquares(10);
    }
}
