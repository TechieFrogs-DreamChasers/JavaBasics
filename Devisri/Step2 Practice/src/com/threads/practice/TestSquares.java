package com.threads.practice;

public class TestSquares extends Thread{

    @Override
    public void run() {
        TestMultiplications.numberSquares(10);
    }
}
