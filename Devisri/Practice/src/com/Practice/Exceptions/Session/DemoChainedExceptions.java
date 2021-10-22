package com.Practice.Exceptions.Session;

import java.util.Arrays;

public class DemoChainedExceptions {
    public static void main(String[] args) {
        code3();
        System.out.println("This is main method!!!");
    }
    static void code1(){
        int[] ints=new int[5];
        for(int i=0;i<=5;i++){
            ints[i]= (int) ((Math.random()*100)+1);
        }
        System.out.println(Arrays.toString(ints));
    }
    static void code2(){
        code1();
    }
    static void code3(){
        try{
            code2();
        }catch (Exception e){
            System.out.println(e.initCause(e.getCause()));
        }
    }
}
