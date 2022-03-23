package com.newPractice.collections.myprograms.maps;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class AllDriver {
    public static void main(String[] args) {
        System.out.println("--------Person Class as Key in HashMap---------");
        HashMap<Person,String> hashPerson = new HashMap<>();
        hashPerson.put(new Person("John Allan",36,true,1986),"Software Developer");
        hashPerson.put(new Person("Anne Thompson",17,false,2005),"Student");
        hashPerson.put(new Person("Meghan Shaw",42,true,1980),"Team-Lead");
        hashPerson.put(new Person("Steve Parker",61,true,1961),"Manager");
        hashPerson.put(new Person("Tom Chance",25,true,1997),"Part-Time");
        hashPerson.put(new Person("Brian Hardly",21,false,2001),"Student");
        //hashPerson.put(new Person(null,null,null,null),null);
        //System.out.println("Normal order: "+hashPerson);
        Iterator<Map.Entry<Person,String>> itr = hashPerson.entrySet().iterator();
        //System.out.println();
        while (itr.hasNext())
            System.out.println("Key-->Value: "+itr.next());
        System.out.println();
        System.out.println("--------Person Class as Key in LinkedHashMap---------");
        LinkedHashMap<Person,String> lhm = new LinkedHashMap<>(hashPerson);
        lhm.entrySet().stream().forEach((p)-> System.out.println("Key-->Value: "+p));
        System.out.println();
        System.out.println("--------Person Class as Key in TreeMap---------");
        TreeMap<Person,String> tm = new TreeMap<>(new SortByBirthYear());
        tm.putAll(hashPerson);
        tm.entrySet().stream().forEach((p)-> System.out.println("Key-->Value: "+p));
        System.out.println();
        System.out.println("--------Person Class as Key in ConcurrentHashMap---------");
        ConcurrentHashMap<Person,String> chm = new ConcurrentHashMap<>(hashPerson);
        chm.entrySet().stream().forEach(p-> System.out.println("Key-->Value: "+p));
    }
}
