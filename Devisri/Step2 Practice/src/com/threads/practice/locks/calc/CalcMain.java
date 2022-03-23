package com.threads.practice.locks.calc;

public class CalcMain {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        CalcThread c1 = new CalcThread(c);
        CalcThread c2 = new CalcThread(c);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c1);
        Thread t4 = new Thread(c2);

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
