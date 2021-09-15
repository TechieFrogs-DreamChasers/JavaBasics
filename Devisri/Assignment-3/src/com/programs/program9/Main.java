package com.programs.program9;

public class Main {
    public static void main(String[] args) {
        WeighedItem wi = new WeighedItem(30);
        System.out.println("The total price of" + wi.getName() + " with unit price of " + wi.getUnit_Price() + "gm : "
                + wi.getPrice(0.50) + "$.");
        System.out.println("***********************************+");
        CountedItem ci = new CountedItem(100);
        System.out.println("The total price of " + ci.getName() + " with unit price of "
                + ci.getUnit_Price() + "each : " + ci.getPrice(0.15) + "$.");

    }
}
