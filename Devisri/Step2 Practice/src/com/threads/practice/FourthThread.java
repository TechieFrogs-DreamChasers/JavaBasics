package com.threads.practice;

public class FourthThread extends Thread{
    public static void executeDoubles(double number){
        double avg = 0.0;
        for(int i=1;i<=number;i++){
            avg+=i;
        }
        System.out.println(">>>From Fourth Thread: "+avg/number);
    }
}
