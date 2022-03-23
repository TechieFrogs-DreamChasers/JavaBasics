package com.newPractice.threads.clol;

public class EvenOddNumbers{
    //class level lock with keyword
    public static synchronized void displayOddNumbers(){
        System.out.println(">>>ClassLevelMethod --> Out of For loop : "+Thread.currentThread().getName());
        for(int i=1;i<=20;i+=2){
            System.out.println(">>>ClassLevelMethod --> "+Thread.currentThread().getName()+" : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //class level lock with block
    public static void displayEvenNumbers(){
        System.out.println(">>>ClassLevelBlock --> Out of For loop : "+Thread.currentThread().getName());
        synchronized (EvenOddNumbers.class){
            for(int i=2;i<=20;i+=2){
                System.out.println(">>>ClassLevelBlock --> "+Thread.currentThread().getName()+" : "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //object level lock with keyword
    public synchronized void doubleOddNumbers(){
        System.out.println(">>>ObjectLevelMethod --> Out of For loop: "+Thread.currentThread().getName());
        for(int i=1;i<=20;i+=2){
            System.out.println(">>>ClassLevelMethod --> "+Thread.currentThread().getName()+" : "+i*i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //object level lock with block
    public void doubleEvenNumbers(){
        System.out.println(">>>ObjectLevelBlock --> Out of For loop: "+Thread.currentThread().getName());
        synchronized (this){
            for(int i=2;i<=20;i+=2){
                System.out.println(">>>ClassLevelMethod --> "+Thread.currentThread().getName()+" : "+i*i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
