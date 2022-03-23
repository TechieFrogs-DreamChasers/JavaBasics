package com.threads.practice.questions;

public class TestOddEven {
    public static void main(String[] args) {
        Runnable runnable1=()->{
            for(int i=1;i<=10;i++){
                if(i%2==0)
                    System.out.println(">>>Printing even numbers: "+i);
            }
        };
        Thread t1 = new Thread(runnable1);
        t1.start();
        Runnable runnable2=()->{
            for(int i=1;i<=10;i++){
                if(i%2!=0)
                    System.out.println(">>>Printing odd numbers: "+i);
            }
        };
        Thread t2 = new Thread(runnable2);
        t2.start();
    }
}
