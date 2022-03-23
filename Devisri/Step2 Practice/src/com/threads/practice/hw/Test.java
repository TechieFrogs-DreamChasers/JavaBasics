package com.threads.practice.hw;

public class Test extends Thread{
    @Override
    public void run() {
        System.out.println("This is Thread testing!!!");
    }
    public static void main(String[] args) {
        Test t = new Test();
        //>>> main-->false
        System.out.println(">>> "+Thread.currentThread().getName()+"-->"+t.isAlive());
        t.start();
        //<<< main-->true
        System.out.println("<<< "+Thread.currentThread().getName()+"-->"+t.isAlive());
    }
}
