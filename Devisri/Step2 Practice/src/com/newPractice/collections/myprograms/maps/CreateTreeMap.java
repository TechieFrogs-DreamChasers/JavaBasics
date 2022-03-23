package com.newPractice.collections.myprograms.maps;

import java.util.SortedMap;
import java.util.TreeMap;

public class CreateTreeMap {
    public static void main(String[] args) {
        SortedMap<String,String> sm = new TreeMap<>();
        sm.put("Mobile Charger","$13.99");
        sm.put("Tablet Charger","$36.53");
        sm.put("Laptop Charger","$45.82");
        sm.put("Airpods Charger","$30.99");
        sm.put("Smart-Watch Charger","$28.36");
        sm.put("Smart-Bulb","$25.36");
        System.out.println(sm);
        TreeMap<String,String> items = new TreeMap<>((TreeMap<String,String>)sm);
        System.out.println("containsKey: "+items.containsKey("Airpods Charger"));
        System.out.println("containsValue: "+items.containsValue("$25.36"));
        System.out.println("firstKey: "+items.firstKey());
        System.out.println("lastKey: "+items.lastKey());
        System.out.println("ceilingKey: "+items.ceilingKey("S"));
        System.out.println("ceilingEntry: "+items.ceilingEntry("Sm"));
        System.out.println();
        System.out.println("descendingMap: "+items.descendingMap());
        System.out.println("descendingKey: "+items.descendingKeySet());
        System.out.println();
        System.out.println("firstEntry: "+items.firstEntry());
        System.out.println("floorEntry: "+items.floorEntry("Mobile"));
        System.out.println("floorKey: "+items.floorKey("Mobile"));
        System.out.println("headMap: "+items.headMap("Smart-Bulb"));
        System.out.println("headMap(inclusive): "+items.headMap("Smart-Bulb",true));
        System.out.println("higherEntry: "+items.higherEntry("Tablet"));
        System.out.println("higherKey: "+items.higherKey("Mobile"));
        System.out.println("lowerEntry: "+items.lowerEntry("Smart-Watch"));
        System.out.println("lowerKey: "+items.lowerKey("Mobile"));
        System.out.println("lastEntry: "+items.lastKey());
        System.out.println("navigableKeySet: "+items.navigableKeySet());
        System.out.println("pollFirstEntry: "+items.pollFirstEntry());
        System.out.println("pollLastEntry: "+items.pollLastEntry());
        System.out.println("size: "+items.size());
        System.out.println("subMap(incl): "+items.subMap("Mobile",true,"Smart-Watch",false));
        System.out.println("subMap: "+items.subMap("Laptop","Smart-Watch"));
        System.out.println("tailMap: "+items.tailMap("Smart-Bulb"));
        System.out.println("tailMap(incl): "+items.tailMap("Smart-Bulb",false));
    }
}
