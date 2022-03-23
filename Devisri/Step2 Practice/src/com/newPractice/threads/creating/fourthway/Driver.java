package com.newPractice.threads.creating.fourthway;

public class Driver {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                System.out.println(display());
            }
            public String display(){
                return "This is a Thread, name: "+Thread.currentThread().getName();
            }
        };
        t1.setName("Display_Thread");
        t1.start();
    }
}
