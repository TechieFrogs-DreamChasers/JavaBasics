package com.threads.practice.locks.calc;

public class CalcThread implements Runnable{
    Calculator calculator;

    public CalcThread(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        try {
            calculator.calculateMethods();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
