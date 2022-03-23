package com.newPractice.collections.myprograms.sets;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class CreateTreeSet {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        //Collections.addAll(names,null,"Anna",null,"Brad","Anna");NPE
        Collections.addAll(names,"Anna","Chad","Karen","Anna","Karen");
        System.out.println("Names: "+names);//no duplicates
        names.add("Brad");
        names.add("Grace");
        names.add("Ivan");
        System.out.println("Names: "+names);//ordered(sorted set)
        Iterator<String> iterator = names.descendingIterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println();
        TreeSet<Integer> integers = new TreeSet<>();
        for(int i=0;i<15;i++){
            integers.add((int)(Math.random()*100+2));
        }
        System.out.println("Numbers: "+integers);
        /*System.out.println();
        Iterator<Integer> itr = integers.descendingIterator();
        while (itr.hasNext())
            System.out.println(itr.next());*/
        System.out.println();
        System.out.println(integers.floor(70));
        System.out.println(integers.ceiling(85));
        System.out.println(integers.lower(51));
        System.out.println(integers.higher(75));
        System.out.println();
        System.out.println(integers.pollFirst());
        System.out.println(integers);
        System.out.println(integers.pollLast());
        System.out.println(integers);
        System.out.println();
        System.out.println(integers.descendingSet());
        System.out.println(integers.headSet(25,true));
        System.out.println(integers.headSet(25,false));
        System.out.println();
        System.out.println(integers.subSet(5,true,39,true));
        System.out.println(integers.subSet(5,false,39,true));
        System.out.println(integers.subSet(5,true,39,false));
        System.out.println(integers.subSet(5,false,39,false));
        System.out.println();
        System.out.println(integers.tailSet(59,true));
        System.out.println(integers.tailSet(59,false));
        System.out.println();
        TreeSet<Double> stocks = new TreeSet<>();
        Collections.addAll(stocks,25.9,1.5,11.9,96.9,52.35,45.2);
        System.out.println(stocks);
        TreeSet<Double> set = new TreeSet<>(Comparator.reverseOrder());
        Collections.addAll(set,5.3,85.9,36.5,15.3,1.5);
        System.out.println(set);

    }
}
