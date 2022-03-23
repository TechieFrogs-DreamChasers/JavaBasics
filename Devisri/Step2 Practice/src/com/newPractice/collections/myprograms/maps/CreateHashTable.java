package com.newPractice.collections.myprograms.maps;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class CreateHashTable {
    public static void main(String[] args) {
        Hashtable<String,String> item_Price = new Hashtable<>();
        item_Price.put("Shampoo","$15.99");
        item_Price.put("Moisturizer","$18.56");
        item_Price.put("Face Wash","$12.99");
        item_Price.put("Lip Stick","$36.16");
        item_Price.put("Face Serum","$23.58");
        Iterator<String> kitr = item_Price.keySet().iterator();
        while (kitr.hasNext()){
            System.out.println("Keys: "+kitr.next());
        }
        Iterator<String> vitr = item_Price.values().iterator();
        while (vitr.hasNext()){
            System.out.println("Values: "+vitr.next());
        }
        Iterator<Map.Entry<String,String>> itr = item_Price.entrySet().iterator();
        while (itr.hasNext()){
            System.out.println("Keys --> Values: "+itr.next());
        }
        System.out.println();
        Enumeration<String> ess = item_Price.keys();
        while (ess.hasMoreElements()){
            System.out.println("E-Keys: "+ess.nextElement());
            item_Price.put("Nail Polish","$3.99");
        }
        System.out.println();
        Enumeration<String> ess2 = item_Price.elements();
        while (ess2.hasMoreElements()){
            System.out.println("E-Keys: "+ess2.nextElement());
        }
        System.out.println();
        Enumeration<String> ess3 = item_Price.keys();
        while (ess3.hasMoreElements()){
            String key = ess3.nextElement();
            System.out.println(key+" : "+item_Price.get(key));
        }

    }
}
