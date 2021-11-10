package com.obj.practice;
//Target class
public class Consumer implements Cloneable{
    int product_Id;
    String product_Name;
    long consumer_Phone;
    Address address;

    public Consumer(int product_Id, String product_Name, long consumer_Phone, Address address) {
        this.product_Id = product_Id;
        this.product_Name = product_Name;
        this.consumer_Phone = consumer_Phone;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "product_Id=" + product_Id +
                ", product_Name='" + product_Name + '\'' +
                ", consumer_Phone=" + consumer_Phone +
                ", address=" + address +
                '}';
    }
    @Override
    public Consumer clone() throws CloneNotSupportedException {
        return (Consumer) super.clone();
    }
}
