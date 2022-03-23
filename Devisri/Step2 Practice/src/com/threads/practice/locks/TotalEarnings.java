package com.threads.practice.locks;

public class TotalEarnings implements Runnable{
    int total = 0;
    @Override
    public void run() {
        synchronized (this){
            for(int i=1;i<=30;i++){
                total+=100;
            }
            this.notify();
        }
    }
}
