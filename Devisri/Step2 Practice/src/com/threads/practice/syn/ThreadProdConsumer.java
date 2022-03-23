package com.threads.practice.syn;

import java.util.ArrayList;
import java.util.List;

public class ThreadProdConsumer {
    static List<Integer> list = new ArrayList<>();


    static class Producer implements Runnable{
        List<Integer> list;

        public Producer(List<Integer> list) {
            this.list = list;
        }

        @Override
        public void run() {
            synchronized (list){
                for(int i=0;i<10;i++){
                    if(list.size() >= 1){
                        try {
                            System.out.println("Producer is waiting!!!");
                            list.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(">>> Producer value: "+i);
                    list.add(i);
                    list.notifyAll();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    static class Consumer implements Runnable{
        List<Integer> list;

        public Consumer(List<Integer> list) {
            this.list = list;
        }

        @Override
        public void run() {
            synchronized (list){
                for(int i=0;i<10;i++){
                    while (list.isEmpty()){
                        System.out.println("Consumer is waiting!!!");
                        try {
                            list.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    int v = list.remove(0);
                    System.out.println(">>> Consumer value: "+v);
                    list.notifyAll();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread producer = new Thread(new Producer(list));
        Thread consumer = new Thread(new Consumer(list));
        producer.start();
        consumer.start();
    }
}
