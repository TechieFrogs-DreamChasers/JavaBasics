package com.coll.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class DemoListInterfaceHomo {
    public static void main(String[] args) {
        //Using collection interface methods
        List<Integer> integers=new ArrayList<>();
        for(Integer i=0;i<5;i++){
            //add()
            integers.add((i+10)*100);
        }
        //can use get method for display
        System.out.println(integers.size());
        System.out.println(integers);
        //Adding element at the end
        integers.add(integers.size(),1450);
        System.out.println(integers);
        //Adding element at the beginning
        integers.add(0,950);
        System.out.println(integers);
        //Adding element at specific index
        integers.add(2,1050);
        System.out.println(integers);
        integers.add(4,1150);
        System.out.println(integers);
        integers.add(6,1250);
        System.out.println(integers);
        integers.add(8,1350);
        System.out.println(integers);
        System.out.println(integers.size());
        List<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Grape");
        fruits.add("Peach");
        fruits.add("Berry");
        fruits.add("Melon");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Banana");
        //IndexOf()
        System.out.println("Index of Berry: "+fruits.indexOf("Berry"));//5
        //lastIndexOf()
        System.out.println("Last Index of Banana: "+fruits.lastIndexOf("Banana"));//9
        List<String> unique_Fruits=new ArrayList<>();
        //Contains()
        for(int i=0;i< fruits.size();i++){
            if(!unique_Fruits.contains(fruits.get(i))){
                unique_Fruits.add(fruits.get(i));
            }
        }
        System.out.println(unique_Fruits);
        //addAll()
        fruits.addAll(unique_Fruits);
        System.out.println(fruits);
        //set()
        fruits.set(5,null);
        System.out.println(fruits);

    }
}
