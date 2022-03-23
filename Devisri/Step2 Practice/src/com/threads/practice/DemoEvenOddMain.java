package com.threads.practice;

public class DemoEvenOddMain {
    public static void main(String[] args) {
        DemoEven even = new DemoEven();
        even.start();
        DemoEven demoEven = new DemoEven();
        demoEven.start();
        DemoOdd odd = new DemoOdd();
        odd.start();
        DemoOdd demoOdd = new DemoOdd();
        demoOdd.start();
    }
}
