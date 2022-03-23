package com.threads.practice;

public class DemoThreadMethods {
    public static void main(String[] args) {
        TestQuads testQuads = new TestQuads();
        System.out.println("Getting Thread Name: "+testQuads.getName());
        //setting Thread name
        testQuads.setName("TestQuads");
        System.out.println("After setting Thread Name: "+testQuads.getName());
        if(testQuads.getName().equalsIgnoreCase("TestQuads")){
            testQuads.start();
        }
        if(Thread.currentThread().isDaemon())
            System.out.println("Deamon Thread");
        else
            System.out.println("User-Thread");

    }
}
