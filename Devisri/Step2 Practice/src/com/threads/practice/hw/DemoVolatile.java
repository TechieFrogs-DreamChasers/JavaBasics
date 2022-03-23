package com.threads.practice.hw;

public class DemoVolatile implements Runnable{
    public static volatile boolean flag;
    @Override
    public void run() {
        flag = true;
        while (flag){
            for(int i=1;i<=10;i++){
                System.out.println(i);
            }
            flag = false;
        }
    }

    public static void main(String[] args) {
        DemoVolatile dv = new DemoVolatile();
        Thread t = new Thread(dv);
        t.start();
    }
}
