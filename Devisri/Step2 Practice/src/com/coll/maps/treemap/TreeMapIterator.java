package com.coll.maps.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapIterator {
    public static void main(String[] args) {
        TreeMap<Integer,String> colors=new TreeMap<>();
        colors.put(1,"Red");
        colors.put(2,"Black");
        colors.put(3,"Yellow");
        colors.put(4,"White");
        colors.put(5,"Violet");
        colors.put(6,"Purple");
        colors.put(7,"Pink");
        colors.put(8,"Green");
        colors.put(9,"Blue");
        colors.put(10,"Indigo");
        Iterator<Map.Entry<Integer,String>> itr=colors.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<Integer,String> pair=itr.next();
            System.out.println(pair.getKey()+") "+pair.getValue());
            //colors.put(11,"Grey");//CME
            //colors.remove(5);//CME
        }
        System.out.println(colors);
    }
}
