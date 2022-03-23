package com.newPractice.collections.myprograms.maps;

import java.util.LinkedHashMap;

public class CreateLinkedHM {
    public static void main(String[] args) {
        LinkedHashMap<String,String> item_Price = new LinkedHashMap<>();
        item_Price.put("Shampoo","$15.99");
        item_Price.put("Moisturizer","$18.56");
        item_Price.put("Face Wash","$12.99");
        item_Price.put("Lip Stick","$36.16");
        item_Price.put("Face Serum","$23.58");
        LinkedHashMap<String,String> lhm = new LinkedHashMap<>(item_Price);
        LinkedHashMap<String,String> lhm2 = new LinkedHashMap<>(20,0.65f,false);
        lhm2.putAll(item_Price);
        LinkedHashMap<String,String> lhm3 = new LinkedHashMap<>(30,0.65f,true);
        lhm3.putAll(item_Price);
        LinkedHashMap<String,String> lhm4 = new LinkedHashMap<>(10,0.85f);
        lhm4.putAll(item_Price);
        System.out.println("Empty Constructor: "+item_Price);
        System.out.println();
        System.out.println("Constructor with Map: "+lhm);
        System.out.println();
        System.out.println("Constructor with ic,lf,access Order=false: "+lhm2);
        System.out.println();
        System.out.println("Constructor with ic,lf,access Order=true: "+lhm3);
        System.out.println();
        System.out.println("Constructor with ic,lf: "+lhm4);
        System.out.println();
    }
}
