package com.threads.practice.myexample;

public class SecondPrinterThread implements Runnable{
    Printer printer;

    public SecondPrinterThread(Printer printer) {
        this.printer = printer;
    }


    @Override
    public void run() {
        printer.printDocuments(5,"Python.pdf");
    }
}
