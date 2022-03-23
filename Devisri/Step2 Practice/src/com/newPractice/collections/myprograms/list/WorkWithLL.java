package com.newPractice.collections.myprograms.list;

import java.util.*;

public class WorkWithLL {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Pink","Black","Violet","Blue","Red"));
        colors.set(2,"Purple");
        System.out.println(colors);
        List<String> colorsList = Collections.synchronizedList(colors);
        Iterator<String> itr = colorsList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();
        /*colors.stream().peek(e->{if(e.contains("Black"))
            e.replace("Black","White");
        }).forEach(System.out::println);*/
        List<String> animals = Collections.synchronizedList(new LinkedList<>());
        Collections.addAll(animals,"Cat","Lion","Dog","Tiger","Horse");
        Iterator<String> itrs = animals.iterator();
        while (itrs.hasNext()){
            System.out.println(itrs.next());
            //animals.add(null);
        }
        System.out.println(animals);
    }
}
