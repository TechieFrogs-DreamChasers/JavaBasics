package com.threads.practice.locks.calc;

public class Calculator {
    public void calculateMethods() throws InterruptedException {
        synchronized(getClass()){
            calculateAddition(400,400);
            Thread.sleep(1000);
            calculateSubtraction(1000,500);
            Thread.sleep(1000);
            calculateMultiplication(10,90);
            Thread.sleep(1000);
            calculateDivision(1000,5);
            Thread.sleep(1000);
        }
    }
    public void calculateAddition(int num1,int num2){
        System.out.println(Thread.currentThread().getName()+" ==> >>Add(): "+(num1+num2));
    }
    public void calculateSubtraction(int num1,int num2){
        System.out.println(Thread.currentThread().getName()+" ==> >>Sub(): "+(num1-num2));
    }
    public void calculateMultiplication(int num1,int num2){
        System.out.println(Thread.currentThread().getName()+" ==> >>Mul(): "+(num1*num2));
    }
    public void calculateDivision(int num1,int num2){
        System.out.println(Thread.currentThread().getName()+" ==> >>Div(): "+(num1/num2));
    }
}
