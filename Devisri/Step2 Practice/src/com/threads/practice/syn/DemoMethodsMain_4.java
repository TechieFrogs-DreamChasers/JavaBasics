package com.threads.practice.syn;

public class DemoMethodsMain_4 {
    public static void main(String[] args) {
        SquaresThread sq1 = new SquaresThread();
        SquaresThread sq2 = new SquaresThread();

        Thread t1 = new Thread(sq1);
        Thread t2 = new Thread(sq1);
        Thread t3 = new Thread(sq2);
        Thread t4 = new Thread(sq2);

        t1.setName("First Thread");
        t2.setName("Second Thread");
        t3.setName("Third Thread");
        t4.setName("Fourth Thread");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
