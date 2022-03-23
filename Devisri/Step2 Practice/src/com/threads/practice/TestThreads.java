package com.threads.practice;

public class TestThreads extends Thread{
    private int threadNumber;

    public TestThreads(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println("Thread from: "+threadNumber+" is: "+i);
            /*try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }
}
