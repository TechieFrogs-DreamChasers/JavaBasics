package com.threads.practice.locks;

public class DemoLocks implements Runnable{

    private long count = 0;

    public synchronized void incrementCount() throws InterruptedException {
        synchronized (getClass()) {
            for(int i=1;i<=10;i++) {
                count++;
                System.out.println(Thread.currentThread().getName()+" ==> "+count);
                Thread.sleep(1000);
            }
        }
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        try {
            incrementCount();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        DemoLocks dl1 = new DemoLocks();
        DemoLocks dl2 = new DemoLocks();

        Thread t1 = new Thread(dl1);
        Thread t2 = new Thread(dl1);
        Thread t3 = new Thread(dl2);
        Thread t4 = new Thread(dl2);

        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");
        t4.setName("Thread-4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

}