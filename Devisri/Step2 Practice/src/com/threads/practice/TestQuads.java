package com.threads.practice;

public class TestQuads extends Thread{
    @Override
    public void run() {
        TestMultiplications.numberQuads(15);
    }
}
