package com.threads.practice.syn;

public class SquaresThread extends Thread{
    @Override
    public void run() {
        DemoMethods demo = new DemoMethods();
        demo.displayEvenSquares(10);
    }
}
