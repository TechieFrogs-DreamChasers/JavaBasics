package com.coll.list.arraylist;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SyncListCopyDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> veggies=new CopyOnWriteArrayList<>();
        veggies.add("Carrot");
        veggies.add("Beetroot");
        veggies.add("Cucumber");
        veggies.add("Potato");
        veggies.add("SweetPotato");
        veggies.add("Onion");
        veggies.add("Green Chilli");
        veggies.add("Peas");
        veggies.add("EggPlant");
        veggies.add("Pumpkin");
        //synchronized list
        Iterator<String> iterator= veggies.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        List<String> synList= Collections.synchronizedList(veggies);
        //Here synchronized block is not req
        Iterator<String> itr=synList.iterator();
        System.out.println(" ");
        while (itr.hasNext()){
            synList.set(4,null);
            System.out.println(itr.next());
        }
        System.out.println(synList);
    }
}
