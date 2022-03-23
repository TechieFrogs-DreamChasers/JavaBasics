package com.threads.practice.locks;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class DemoReadWriteLock {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Map<String,String> map = new HashMap<>();
        ReadWriteLock lock = new ReentrantReadWriteLock();
        service.submit(()->{
            lock.writeLock().lock();
            try{
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                map.put("Rome","Italy");
            }finally {
                lock.writeLock().unlock();
            }
        });
    }
}
