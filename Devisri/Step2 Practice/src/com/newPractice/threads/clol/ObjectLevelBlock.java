package com.newPractice.threads.clol;

public class ObjectLevelBlock implements Runnable{

    @Override
    public void run() {
        doubleEvenNumbers();
    }
    public void doubleEvenNumbers(){
        System.out.println(">>>ObjectLevelBlock --> Out of For loop: "+Thread.currentThread().getName());
        synchronized (getClass()){
            for(int i=2;i<=20;i+=2){
                System.out.println(">>>ObjectLevelBlock --> "+Thread.currentThread().getName()+" : "+i*i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
