package com.threads.practice.hw;

public class DemoLiveLock {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Shop shop = new Shop();
        Thread t1 = new Thread(()->{
            customer.payMoney(shop);
        });
        Thread t2 = new Thread(()->{
            shop.shipOrder(customer);
        });
        t1.start();
        t2.start();
    }
}
