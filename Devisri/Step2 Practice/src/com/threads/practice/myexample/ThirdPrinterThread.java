package com.threads.practice.myexample;

import java.util.concurrent.Callable;

public class ThirdPrinterThread implements Callable {

    Printer printer;

    public ThirdPrinterThread(Printer printer) {
        this.printer = printer;
    }

    @Override
    public Object call() throws Exception {
        printer.printDocuments(15,"Java.pdf");
        return null;
    }
}
