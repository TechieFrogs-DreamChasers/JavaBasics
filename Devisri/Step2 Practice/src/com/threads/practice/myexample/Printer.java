package com.threads.practice.myexample;

public class Printer {
    public void printDocuments(int number,String docName){
        for(int i=1;i<=number;i++){
            System.out.println(">>>Printing "+docName+ "'s copy and count is: "+i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
