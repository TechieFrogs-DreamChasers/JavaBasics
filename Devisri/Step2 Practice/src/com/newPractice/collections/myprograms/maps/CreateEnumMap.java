package com.newPractice.collections.myprograms.maps;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

public class CreateEnumMap {
    public enum Days{
        SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
    }
    public static void main(String[] args) {
        EnumMap<Days,String> daysmap = new EnumMap<Days, String>(Days.class);
        daysmap.put(Days.WEDNESDAY,"4");
        daysmap.put(Days.FRIDAY,"6");
        daysmap.put(Days.SATURDAY,"7");
        daysmap.put(Days.MONDAY,"2");
        daysmap.put(Days.THURSDAY,"5");
        daysmap.put(Days.SUNDAY,"1");
        daysmap.put(Days.TUESDAY,"3");
        System.out.println(daysmap);
        System.out.println();
        Iterator<Map.Entry<Days,String>> iterator = daysmap.entrySet().iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println();
        daysmap.entrySet().stream().forEach(e-> System.out.println("Key-->Value: "+e));
    }
}
