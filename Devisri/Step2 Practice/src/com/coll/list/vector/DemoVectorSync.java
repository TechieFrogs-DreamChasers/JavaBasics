package com.coll.list.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class DemoVectorSync {
    public static void main(String[] args) {
        Vector<String> day_Names=new Vector<>();
        day_Names.add("Monday");
        day_Names.add("Tuesday");
        day_Names.add("Wednesday");
        day_Names.add("Thursday");
        day_Names.add("Friday");
        day_Names.add("Saturday");
        day_Names.add("Sunday");
        Enumeration<String> enumeration=day_Names.elements();
        //This loop executed successfully proving vector is synchronised
        //Enumeration is fail-safe
        while (enumeration.hasMoreElements()){
            day_Names.add("Sunday");
            System.out.println(enumeration.nextElement());
            day_Names.remove("Sunday");
        }
        //This loop executed unsuccessfully if line 30 is uncommented
        //Iterator is fail-fast
        Iterator<String> iterator=day_Names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            //day_Names.add("Sunday");
        }
    }
}
