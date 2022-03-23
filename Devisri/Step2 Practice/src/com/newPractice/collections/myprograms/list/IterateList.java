package com.newPractice.collections.myprograms.list;

import com.newPractice.collections.ALassignment.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateList {
    public static void main(String[] args) {
        List<String> countries = Lists.getCountries();
        System.out.println("Normal for: ");
        for(int i=0;i< countries.size();i++){
            System.out.println(countries.get(i));
        }
        System.out.println("for-each");
        for(String s:countries){
            System.out.println(s);
        }
        System.out.println("Iterator: ");
        Iterator<String> itr = countries.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
        System.out.println("ListIterator: ");
        ListIterator<String> litr = countries.listIterator();
        while (litr.hasNext())
            System.out.println(litr.next());
        while (litr.hasPrevious())
            System.out.println(litr.previous());
        System.out.println("streams: ");
        countries.stream().forEach(System.out::println);
    }
}
