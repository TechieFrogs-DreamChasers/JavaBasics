package com.threads.practice;

public class DemoOdd extends Thread{
    public void run() {
        displayOddNumbers();
    }
    public void displayOddNumbers(){
        System.out.println("Odd Numbers: ");
        for(int i=1;i<20;i+=2){
            if(i%2!=0)
                System.out.println(i);
        }
    }
}
