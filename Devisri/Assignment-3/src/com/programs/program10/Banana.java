package com.programs.program10;

public class Banana extends Apple {
    private int no_of_items;

    public Banana(int no_of_items) {
        this.no_of_items = no_of_items;
    }

    public void show() {
        System.out.println("The Number of bananas are: " + no_of_items);
        System.out.println("The Number of Apples are: " + super.no_of_items);
    }
}
