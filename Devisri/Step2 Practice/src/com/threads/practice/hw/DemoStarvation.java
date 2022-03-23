package com.threads.practice.hw;

public class DemoStarvation {
    public synchronized void testStarvation(){
        try {
            System.out.println(">>> Testing... "+Thread.currentThread().getName());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        DemoStarvation ds = new DemoStarvation();
        Thread t1 = new Thread(new MyRunnable(ds),"T1");
        Thread t2 = new Thread(new OurRunnable(ds),"T2");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
class MyRunnable implements Runnable{
    DemoStarvation ds;
    public MyRunnable(DemoStarvation ds) {
        this.ds = ds;
    }
    @Override
    public void run() {
        ds.testStarvation();
        ds.testStarvation();
    }
}
class OurRunnable implements Runnable{
    DemoStarvation ds;

    public OurRunnable(DemoStarvation ds) {
        this.ds = ds;
    }

    @Override
    public void run() {
        ds.testStarvation();
    }
}