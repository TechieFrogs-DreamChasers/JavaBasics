package com.threads.practice.locks;

public class MovieTicketBooking {
    public static void main(String[] args) throws InterruptedException {
        TotalEarnings te = new TotalEarnings();
        Thread t1 = new Thread(te);
        t1.start();
        synchronized (te){
            te.wait();
            System.out.println("Total Earnings: "+te.total+"/-");
        }
    }
}
