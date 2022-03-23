package com.newPractice.collections.myprograms.list;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class WorkWithV {
    public static void main(String[] args) {
        Vector<Double> stockPrices = new Vector<>();
        Collections.addAll(stockPrices,25.3,29.5,31.36,25.21,50.9);
        Enumeration<Double> enu = stockPrices.elements();
        while (enu.hasMoreElements())
        {
            System.out.println(enu.nextElement());
            stockPrices.remove(2);
        }
    }
}
