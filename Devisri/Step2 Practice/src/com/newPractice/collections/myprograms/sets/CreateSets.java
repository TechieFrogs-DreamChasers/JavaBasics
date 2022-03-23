package com.newPractice.collections.myprograms.sets;

import com.newPractice.collections.ALassignment.Lists;

import java.util.*;

public class CreateSets {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>(Lists.getCountries());
        System.out.println(countries);
        System.out.println();
       /* Iterator<String> itr = countries.iterator();
        while (itr.hasNext())
        {
            //countries.add("Japan");CME
           // countries.remove("China");CME
            System.out.println(itr.next());
            //countries.add("Japan");CME
            //countries.remove("China");CME
        }*/
        System.out.println(countries.removeIf(e->e.contains("en")));
        System.out.println(countries);
        System.out.println();
        Set<String> set = new HashSet<>(countries);
        set.remove("Mexico");
        set.remove("Spain");
        System.out.println(set);
        System.out.println();
        System.out.println(countries.containsAll(set));
        System.out.println(set.containsAll(countries));
        /*countries.removeAll(set);
        System.out.println(countries);
        countries.retainAll(set);
        System.out.println(countries);
        System.out.println(set);*/
        System.out.println();
        countries.spliterator().forEachRemaining(System.out::println);
        System.out.println();
        HashSet<String> names = new HashSet<>();
        Collections.addAll(names,"John","Anna","Chad","Brad","Anna");
        System.out.println("Names: "+names);
        System.out.println();
        names.stream().spliterator().trySplit().forEachRemaining(System.out::println);
        System.out.println();
        Set<String> hashSet = Collections.unmodifiableSet(names);
        System.out.println(hashSet);
    }
}
