package com.threads.practice.questions;

public class TestEvenThread extends Thread{
    @Override
    public void run() {
        evenNumbers(10);
    }
    public static void evenNumbers(int number){
        for(int i=1;i<=number;i++){
            if(i%2==0)
                System.out.println(">>>Printing from Even Thread: "+i);
        }
    }
}
