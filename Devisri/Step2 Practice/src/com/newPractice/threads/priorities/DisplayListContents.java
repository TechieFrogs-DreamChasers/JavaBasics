package com.newPractice.threads.priorities;

import java.util.concurrent.CopyOnWriteArrayList;

public class DisplayListContents implements Runnable{
    @Override
    public void run() {
        displayListContents();
    }
    public static synchronized void displayListContents(){
        CopyOnWriteArrayList<Integer> numbers = new CopyOnWriteArrayList<>();
        for(int i=0;i<10;i++){
            numbers.add((int)(Math.random()*1000+1));
        }
        for(Integer number:numbers){
            System.out.println(Thread.currentThread().getName()+"--> >>>Display: "+number);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
