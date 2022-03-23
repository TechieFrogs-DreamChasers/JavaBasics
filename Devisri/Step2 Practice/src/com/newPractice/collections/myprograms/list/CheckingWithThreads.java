package com.newPractice.collections.myprograms.list;

import java.util.*;

public class CheckingWithThreads {
    public static void main(String[] args) {
        DisplayList dl = new DisplayList();
        DisplayList dl2 = new DisplayList();
        Thread t1 = new Thread(dl);
        Thread t2 = new Thread(dl2);
        Thread t3 = new Thread(dl);
        Thread t4 = new Thread(dl2);
        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");
        t4.setName("T4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class DisplayList implements Runnable {
    @Override
    public void run() {
        List<Integer> numbers = Collections.synchronizedList(new ArrayList<>());
        Collections.addAll(numbers,25,35,69,82,2,1,25,36,69,71,50);
        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()){
            System.out.println(Thread.currentThread().getName()+": "+itr.next());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}