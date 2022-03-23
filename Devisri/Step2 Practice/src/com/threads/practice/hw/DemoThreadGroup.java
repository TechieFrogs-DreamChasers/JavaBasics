package com.threads.practice.hw;

public class DemoThreadGroup implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println(">>> Printing: "+i+" ==> "+Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        ThreadGroup group1 = new ThreadGroup("First Group");
        ThreadGroup group2 = new ThreadGroup("Second Group");
        DemoThreadGroup demo1 = new DemoThreadGroup();
        Thread t1 = new Thread(group1,demo1);
        Thread t2 = new Thread(group2,demo1);
        t1.setName("T1");
        t2.setName("T2");
        t1.start();
        t2.start();
    }

}
