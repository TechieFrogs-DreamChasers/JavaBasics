package com.threads.practice.questions;

public class TestOddThread extends Thread{
    @Override
    public void run() {
        oddNumbers(10);
    }

    public static void oddNumbers(int number){
        for(int i=1;i<=number;i++){
            if(i%2!=0)
                System.out.println(">>>Printing from Odd Thread: "+i);
        }
    }
}
