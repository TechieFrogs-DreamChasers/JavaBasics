package com.threads.practice.syn;

public class MyThreadOps {
    public static void printingCharacters(String ch){
        System.out.println(Thread.currentThread().getName());
        synchronized (MyThreadOps.class){
            for(char i=0;i<ch.length();i++){
                    char letter = ch.charAt(i);
                    System.out.println(">>>Printing Characters: "+letter+" ==> "+Thread.currentThread().getName());
            }
        }
    }
    public void printingNumbers(int number){
        System.out.println(Thread.currentThread().getName());
        synchronized (getClass()){
            for(int i=1;i<=number;i++){
                System.out.println(">>>Printing Numbers: "+i+" ==> "+Thread.currentThread().getName());
            }
        }
    }
    public void printLowerCaseLetters(String word){
        System.out.println(Thread.currentThread().getName());
        synchronized (getClass()){
            for (int i=0;i<word.length();i++){
                char letter = word.charAt(i);
                if(Character.isLowerCase(letter)){
                    System.out.println(">>>Printing Lowercase Letters: "+letter+" ==> "+Thread.currentThread().getName());
                }
            }
        }
    }
    public void printingOddCubes(int number){
        System.out.println(Thread.currentThread().getName());
        synchronized (getClass()){
            for(int i=1;i<=number;i++){
                if(i%2==0)
                    System.out.println(">>>Printing Even Numbers: "+i+" ==> "+Thread.currentThread().getName());
                else
                    System.out.println(">>>Printing Odd Number Cubes: "+i*i*i+" ==> "+Thread.currentThread().getName());
            }
        }
    }
}
