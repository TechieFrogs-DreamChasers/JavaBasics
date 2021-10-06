package com.programs.program9;

public class CountedItem extends PurchasedItem {
    private int quantity;

    public CountedItem(int quantity) {
        super("Tablets", 0.15);
        this.quantity = quantity;
    }

    @Override
    public double getPrice(double unit_Price) {
        double price = unit_Price * quantity;
        return price;
    }
}
