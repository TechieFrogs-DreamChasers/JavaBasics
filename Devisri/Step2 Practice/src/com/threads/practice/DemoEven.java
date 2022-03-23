package com.threads.practice;

public class DemoEven extends Thread{
    public void run() {
        displayEvenNumbers();
    }

    public void displayEvenNumbers(){
        System.out.println("Even Numbers: ");
        for(int i=2;i<20;i+=2){
            if(i%2==0)
                System.out.println(i);
        }
    }
}
