package com.threads.practice.syn;

public class MyThreadMain_4 {
    public static void main(String[] args) {
        MyThreadOps ops = new MyThreadOps();
        Thread t1 = new Thread(() -> ops.printLowerCaseLetters("AmAlGAmaTion"));
        Thread t2 = new Thread(() -> ops.printLowerCaseLetters("PHone"));
        t1.start();
        t2.start();
    }
}
