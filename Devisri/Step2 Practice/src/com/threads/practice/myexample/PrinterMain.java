package com.threads.practice.myexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrinterMain {
    public static void main(String[] args) {
        Printer printer = new Printer();
        //main thread
        System.out.println("====Application Started!!!====");
        //Child thread-1
        FirstPrinterThread firstPrinterThread = new FirstPrinterThread(printer);
        firstPrinterThread.start();
        /*try {
            firstPrinterThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        //Child thread-2
        Thread thread = new Thread(new SecondPrinterThread(printer));
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Child thread-3
        ExecutorService service = Executors.newFixedThreadPool(5);
        service.submit(new ThirdPrinterThread(printer));


        //main thread
        System.out.println("====Application Stopped!!!====");
    }
}
