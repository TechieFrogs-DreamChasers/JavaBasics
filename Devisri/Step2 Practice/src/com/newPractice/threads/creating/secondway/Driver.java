package com.newPractice.threads.creating.secondway;

public class Driver {
    public static void main(String[] args) throws InterruptedException {
        OddThread o = new OddThread();
        Thread ot = new Thread(o);
        ot.setName("OT-1");
        ot.start();
        ot.join();
        Thread ot2 = new Thread(o);
        ot2.setName("OT-2");
        ot2.start();
        ot2.join();
        Thread ot3 = new Thread(o);
        ot3.setName("OT-3");
        ot3.start();

    }
}
