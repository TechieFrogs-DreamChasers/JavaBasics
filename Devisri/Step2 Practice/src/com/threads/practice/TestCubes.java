package com.threads.practice;

public class TestCubes implements Runnable{
    @Override
    public void run() {
        TestMultiplications.numberCubes(15);
    }
}
