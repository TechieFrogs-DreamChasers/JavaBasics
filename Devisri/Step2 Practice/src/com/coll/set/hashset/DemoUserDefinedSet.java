package com.coll.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class DemoUserDefinedSet {
    public static void main(String[] args) {
        HashSet<Books> books=new HashSet<>();
        books.add(new Books(30031,"Shadow And Bone","Leigh bardugo",19.32));
        books.add(new Books(30032,"Six Of Crows","Leigh bardugo",29.32));
        books.add(new Books(30033,"Storm & Siege","Leigh bardugo",19.32));
        books.add(new Books(30034,"Crooked Kingdom","Leigh bardugo",21.32));
        books.add(new Books(30035,"Ruin & Rising","Leigh bardugo",19.32));
        Iterator<Books> booksIterator=books.iterator();
        while (booksIterator.hasNext())
            System.out.println(booksIterator.next());
        System.out.println(" ");
        books.forEach(System.out::println);


    }
}
