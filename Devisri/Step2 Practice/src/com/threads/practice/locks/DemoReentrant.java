package com.threads.practice.locks;

public class DemoReentrant implements Runnable{
    public static void main(String[] args) {
        DemoReentrant d1 = new DemoReentrant();
        DemoReentrant d2 = new DemoReentrant();

        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);
        Thread t3 = new Thread(d1);
        Thread t4 = new Thread(d2);

        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");
        t4.setName("T4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

    @Override
    public void run() {
        printNumbers();
    }

    public void printNumbers(){
        synchronized (getClass()){
            for(int i=1;i<=10;i++){
                System.out.println(Thread.currentThread().getName()+" ==> >>>PrintNumbers(): "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            printMoreNumbers();
        }
    }

    public synchronized void printMoreNumbers(){
        for(int i=11;i<=20;i++){
            System.out.println(Thread.currentThread().getName()+" ==> >>>PrintMoreNumbers(): "+i);
        }
    }

}
