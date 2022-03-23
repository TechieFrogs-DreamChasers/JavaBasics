package com.threads.practice.myexample;

public class FirstPrinterThread extends Thread{
    Printer printer;

    public FirstPrinterThread(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printDocuments(10,"C.pdf");
    }
}
