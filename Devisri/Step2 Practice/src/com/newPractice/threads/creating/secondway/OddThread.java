package com.newPractice.threads.creating.secondway;

public class OddThread implements Runnable{
    @Override
    public void run() {
        oddNumbers(25);
    }
    public void oddNumbers(int range){
        for(int i=1;i<=range;i+=2){
            System.out.println(">>>Odd Thread: "+Thread.currentThread().getName()+" ==> "+i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
