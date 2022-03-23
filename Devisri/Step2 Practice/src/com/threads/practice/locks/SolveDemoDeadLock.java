package com.threads.practice.locks;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
//Solved DeadLock
public class SolveDemoDeadLock {
    public static void main(String[] args) {
        List<String> male_List = Arrays.asList("John","Brain","Samuel","Smith","Greg");
        List<String> female_List = Arrays.asList("Mary","Rose","Bradley","Anna","Grace");

        CopyOnWriteArrayList<String> m_L = new CopyOnWriteArrayList<>(male_List);
        CopyOnWriteArrayList<String> f_L = new CopyOnWriteArrayList<>(female_List);


        Thread t1 = new Thread(() -> {
            synchronized (m_L){
                System.out.println(Thread.currentThread().getName()+" ==> "+m_L);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (f_L){
                    f_L.addAll(m_L);
                    System.out.println(Thread.currentThread().getName()+" ==> "+f_L);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        });
        Thread t2 = new Thread(() -> {
            synchronized (m_L){
                System.out.println(Thread.currentThread().getName()+" ==> "+f_L);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (f_L){
                    m_L.addAll(f_L);
                    System.out.println(Thread.currentThread().getName()+" ==> "+m_L);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        });
        t1.setName("T1");
        t2.setName("T2");

        t1.start();
        t2.start();
    }
}
