package com.newPractice.collections.myprograms.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class WorkWithCOWAL {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> animals = new CopyOnWriteArrayList<>();
        Collections.addAll(animals,"Tiger","Lion","Bear","Horse","Dog");
        Iterator<String> itr = animals.iterator();
        while (itr.hasNext()){
            animals.add("Cat");
            System.out.println(itr.next());
            animals.remove("Bear");
        }
        System.out.println(animals);

        System.out.println();

        CopyOnWriteArrayList<Integer> numbers = new CopyOnWriteArrayList<>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(21);
        numbers.add(13);
        numbers.add(41);
        Iterator<Integer> itrs = numbers.iterator();
        while (itrs.hasNext()){
            numbers.add(55);
            System.out.println(itrs.next());
            numbers.remove(Integer.valueOf(21));
        }
        System.out.println(numbers);
    }
}
