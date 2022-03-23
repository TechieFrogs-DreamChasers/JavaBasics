package com.threads.practice.syn;

public class DemoMethods {
    public static void displayUpperCaseLetters(String word){
        System.out.println(Thread.currentThread().getName());
        synchronized (DemoMethods.class){
            for(int i=0;i<word.length();i++){
                if(Character.isUpperCase(word.charAt(i)))
                    System.out.println(">>>"+Thread.currentThread().getName()+" ==> "+word.charAt(i));
            }
        }
    }
    public void displayEvenSquares(int number){
        System.out.println(Thread.currentThread().getName());
        synchronized (getClass()){
            for(int i=1;i<=number;i++){
                if(i%2==0)
                    System.out.println(">>>"+Thread.currentThread().getName()+" ==> "+i*i);
                else
                    System.out.println(">>>"+Thread.currentThread().getName()+" ==> "+i);
            }
        }
    }
}
