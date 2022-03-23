package com.threads.practice.locks;

public class ReentrantTester implements Runnable{
    public static void main(String[] args) {
      ReentrantTester tester1 = new ReentrantTester();
      ReentrantTester tester2 = new ReentrantTester();

      Thread t1 = new Thread(tester1);
      Thread t2 = new Thread(tester2);
      Thread t3 = new Thread(tester1);
      Thread t4 = new Thread(tester2);

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
        testingMethodA();
    }
    public void testingMethodA(){
        synchronized (getClass()){
            System.out.println(Thread.currentThread().getName()+" ==> "+" ***testingMethodA()");
            testingMethodB();
        }
    }
    public synchronized void testingMethodB(){
        System.out.println(Thread.currentThread().getName()+" ==> "+" >>>testingMethodB()");
    }
}
