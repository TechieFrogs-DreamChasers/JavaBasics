package com.newPractice.threads.creating.oneway;

public class EvenThread extends Thread{
    @Override
    public void run() {
        evenNumbers(50);
    }
    public void evenNumbers(int range){
        for(int i=2;i<range;i+=2){
            if(i%2==0)
                System.out.println(">>>Even Thread: "+Thread.currentThread().getName()+" ==> "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
