package com.coll.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class DemoCopyOn {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add((int)(Math.random()*100+1));
        }
        Integer value=list.get(5);
        System.out.println(list);
        Iterator<Integer> iterator= list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            if(iterator.next()==value)
              iterator.remove();
        }
        System.out.println(list);
    }
}
