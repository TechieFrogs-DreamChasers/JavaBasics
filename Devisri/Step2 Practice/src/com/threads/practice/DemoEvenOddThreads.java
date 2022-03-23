package com.threads.practice;

public class DemoEvenOddThreads extends Thread{
    @Override
    public void run() {
        displayEvenNumbers();
        displayOddNumbers();
    }

    public void displayEvenNumbers(){
        System.out.println("Even Numbers: ");
        for(int i=2;i<20;i+=2){
            if(i%2==0)
                System.out.println(i);
        }
    }
    public void displayOddNumbers(){
        System.out.println("Odd Numbers: ");
        for(int i=1;i<20;i+=2){
            if(i%2!=0)
                System.out.println(i);
        }
    }
}
