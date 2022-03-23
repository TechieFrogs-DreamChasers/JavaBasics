package com.threads.practice;

public class AllMain {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            TestThreads tts = new TestThreads(i);
            tts.start();
        }
    }
}
