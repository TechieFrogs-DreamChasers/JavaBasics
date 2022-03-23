package com.threads.practice.locks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//DeadLock
public class DemoDeadLock {
    public static void main(String[] args) {
        List<String> male_List = Arrays.asList("John","Brain","Samuel","Smith","Greg");
        List<String> female_List = Arrays.asList("Mary","Rose","Bradley","Anna","Grace");
        //List<String> names_list = new ArrayList<>();

        Thread t1 = new Thread(() -> {
            synchronized (male_List){
                System.out.println(Thread.currentThread().getName()+" ==> "+male_List);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (female_List){
                    female_List.addAll(male_List);
                    System.out.println(Thread.currentThread().getName()+" ==> "+female_List);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        });
        Thread t2 = new Thread(() -> {
            synchronized (female_List){
                System.out.println(Thread.currentThread().getName()+" ==> "+female_List);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (male_List){
                    male_List.addAll(female_List);
                    System.out.println(Thread.currentThread().getName()+" ==> "+male_List);
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
