package com.threads.practice;

import java.util.Arrays;

public class Operations {
    public static void executeStringOps(String sentence){
        String[] words = sentence.split(" ");
        System.out.println(">>> From first Thread: "+ Arrays.toString(words));
    }
    public static void executeIntegers(int num){
        for(int i=1;i<=num;i++){
            if(i%2!=0)
                System.out.println(">>>From Second Thread: "+i);
            else
                System.out.println(">>>From Second Thread: "+i*i*i);
        }
    }
    public static boolean executeBooleans(String w1,String w2){
       return w1.equals(w2);
    }
    public static void executeDoubles(double number){
        double avg = 0.0;
        for(int i=1;i<=number;i++){
            avg+=i;
        }
        System.out.println(">>>From Fourth Thread: "+avg/number);
    }

    public static void executeCubes(int num){
        for(int i=1;i<=num;i++){
            if(i%2!=0)
                System.out.println(">>>From executeCubes(): "+i*i*i);
            else
                System.out.println(">>>From executeCubes(): "+i*i*i);
        }
    }

}
