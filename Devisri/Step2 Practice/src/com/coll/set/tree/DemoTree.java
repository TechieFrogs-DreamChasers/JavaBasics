package com.coll.set.tree;

import java.util.Iterator;
import java.util.TreeSet;

public class DemoTree {
    public static void main(String[] args) {
        TreeSet<Integer> numbers=new TreeSet<>();
        for(int i=0;i<15;i++){
            numbers.add((int)(Math.random()*1000+1));
        }
        System.out.println(numbers);
        Iterator<Integer> integerIterator=numbers.iterator();
        while (integerIterator.hasNext())
            System.out.println(integerIterator.next());
        System.out.println(" ");
        Iterator<Integer> itr=numbers.descendingIterator();
        while (itr.hasNext())
            System.out.println(itr.next());
        //Navigation methods
        System.out.println(numbers.first()+"\t"+numbers.last());//85 942
        System.out.println("Higher(): "+numbers.higher(500));//after specified 500 greater element in set is 575
        System.out.println("Lower(): "+numbers.lower(100));//47
        System.out.println("Ceiling(): "+numbers.ceiling(250));//266
        System.out.println("Floor(): "+numbers.floor(300));//283
        //pollFirst,pollLast()
        System.out.println("pollFirst(): "+numbers.pollFirst());//30
        System.out.println("pollLast(): "+numbers.pollLast());//884
        System.out.println(numbers);
        //headSet(),tailSet(),subSet()
        TreeSet<String> cities=new TreeSet<>();
        cities.add("Madrid");
        cities.add("Venice");
        cities.add("Barcelona");
        cities.add("Florence");
        cities.add("Milano");
        System.out.println(cities);
        System.out.println("headSet(): "+cities.headSet("Madrid"));//[Barcelona, Florence]
        System.out.println("headSet(string,boolean): "+cities.headSet("Milano",true));//[Barcelona, Florence, Madrid, Milano]
        System.out.println("headSet(string,boolean): "+cities.headSet("Milano",false));//[Barcelona, Florence, Madrid]
        System.out.println("tailSet(): "+cities.tailSet("Florence"));//[Florence, Madrid, Milano, Venice]
        System.out.println("tailSet(): "+cities.tailSet("Florence",false));//[Madrid, Milano, Venice]
        System.out.println("subSet(): "+cities.subSet("Florence","Venice"));//[Florence, Madrid, Milano]
        System.out.println("subSet(): "+cities.subSet("Florence",false,"Venice",true));//[Madrid, Milano, Venice]
        //Union of two sets addAll()
        //Intersection of two sets retainAll()
        //Difference of two sets removeAll()
        //Subset of a Set containsAll()
    }
}
