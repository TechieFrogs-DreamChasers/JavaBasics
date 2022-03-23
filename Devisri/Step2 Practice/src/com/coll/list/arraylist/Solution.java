package com.coll.list.arraylist;

import java.util.*;

public class Solution {
    public static void main(String[] args) {

    }
    public static HashMap<String, Integer> createMap() {
        //write your code here
        HashMap<String, Integer> employees = new HashMap<>();
        employees.put("Anna",5000);
        employees.put("Bradley",1500);
        employees.put("Christy",2500);
        employees.put("David",500);
        employees.put("Elena",600);
        employees.put("Frank",3500);
        employees.put("George",300);
        employees.put("Henry",4000);
        employees.put("Ian",3000);
        employees.put("John",100);
        return employees;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //write your code here
        HashMap<String, Integer> employees = new HashMap<>(map);
        for(Map.Entry<String,Integer> pair: employees.entrySet()){
            if(pair.getValue() < 500)
                employees.remove(pair.getKey());
        }
    }



}
