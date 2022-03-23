package com.threads.practice.hw;

public class TestNumbers {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.run();
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(">>> Start!!!");
        for (int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+" ==> "+i);
        }
        System.out.println(">>> Stop!!!");
    }
}