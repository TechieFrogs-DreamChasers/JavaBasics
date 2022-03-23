package com.coll.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {

        HashMap<String,Integer> name_Age=new HashMap<>();
            name_Age.put("John",21);
            name_Age.put(null,null);
            name_Age.put("Sam",null);
        System.out.println(name_Age);

        //TreeMap<String,Integer> link_Name_Age=new TreeMap<>(name_Age);
    }
}
