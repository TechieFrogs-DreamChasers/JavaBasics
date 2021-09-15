package com.programs.program9;

public class PurchasedItem {
    private String name;
    private double unit_Price;

    public PurchasedItem(String name, double unit_Price) {
        this.name = name;
        this.unit_Price = unit_Price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnit_Price() {
        return unit_Price;
    }

    public void setUnit_Price(double unit_Price) {
        this.unit_Price = unit_Price;
    }

    public double getPrice(double unit_Price) {
        return unit_Price;
    }

}
