package com.newPractice.threads.clol;

public class ObjectLevelMethod implements Runnable{
    @Override
    public void run() {
        doubleOddNumbers();
    }
    public synchronized void doubleOddNumbers(){
        System.out.println(">>>ObjectLevelMethod --> Out of For loop: "+Thread.currentThread().getName());
        for(int i=1;i<=20;i+=2){
            System.out.println(">>>ObjectLevelMethod --> "+Thread.currentThread().getName()+" : "+i*i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
