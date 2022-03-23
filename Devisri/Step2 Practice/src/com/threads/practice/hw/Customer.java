package com.threads.practice.hw;

public class Customer {
    private boolean paid;
    public void payMoney(Shop shop){
        while (!shop.isOrderShipped()){
            System.out.println("Waiting for order....");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        setPaid(true);
    }
    public boolean isPaid() {
        return paid;
    }
    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
