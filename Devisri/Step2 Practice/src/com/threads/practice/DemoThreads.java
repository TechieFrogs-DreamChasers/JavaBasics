package com.threads.practice;

public class DemoThreads implements Runnable
{
    @Override
    public void run() {
        String fun = stringOps("Funny");
        System.out.println("Modified String: "+fun);
    }
    public String stringOps(String s){
        return s.toLowerCase()+" = "+s.toUpperCase();
    }
}
