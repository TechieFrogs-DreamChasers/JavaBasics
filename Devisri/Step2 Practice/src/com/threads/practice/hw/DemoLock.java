package com.threads.practice.hw;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DemoLock implements Runnable{
    Resources res;
    Lock lock;

    public DemoLock(Resources res) {
        this.res = res;
        this.lock = new ReentrantLock();
    }

    @Override
    public void run() {
        try {
            if(lock.tryLock(10, TimeUnit.SECONDS)){
                res.display();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        res.show();
    }

    public static void main(String[] args) {
        Thread t = new Thread(new DemoLock(new Resources()),"T0");
        t.start();
    }
}
class Resources {
    public void display(){
        System.out.println("This is display()");
    }
    public void show(){
        System.out.println("This is show()");
    }
}