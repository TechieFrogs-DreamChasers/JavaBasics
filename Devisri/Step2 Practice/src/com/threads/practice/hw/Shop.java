package com.threads.practice.hw;

public class Shop {
    private boolean orderShipped;
    public void shipOrder(Customer customer){
        while (!customer.isPaid()){
            System.out.println("Waiting for payment....");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        setOrderShipped(true);
    }
    public boolean isOrderShipped() {
        return orderShipped;
    }
    public void setOrderShipped(boolean orderShipped) {
        this.orderShipped = orderShipped;
    }
}
