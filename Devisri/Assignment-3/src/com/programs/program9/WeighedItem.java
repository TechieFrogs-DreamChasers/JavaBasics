package com.programs.program9;

public class WeighedItem extends PurchasedItem {
    private double weight;

    public WeighedItem(double weight) {
        super(" Shampoo Bottle", 0.50);
        this.weight = weight;
    }

    @Override
    public double getPrice(double unit_Price) {
        double price = unit_Price * weight;
        return price;
    }
}
