package com.coll.set.hashset;

import java.util.HashSet;

public class BooksMain {
    public static void main(String[] args) {
        HashSet<Books> books=new HashSet<>();
        books.add(new Books(30031,"Shadow And Bone","Leigh bardugo",19.32));
        books.add(new Books(30032,"Six Of Crows","Leigh bardugo",29.32));
        books.add(new Books(30033,"Storm & Siege","Leigh bardugo",19.32));
        books.add(new Books(30031,"Shadow And Bone","Leigh bardugo",19.32));
        books.add(new Books(30032,"Six Of Crows","Leigh bardugo",29.32));
        //Before overriding equals and hashcode method in my user-class
        //books.forEach(System.out::println);//All are printed despite being duplicate values
        //After overriding hashcode() & equals() in user-Class duplicates are skipped
        books.forEach(System.out::println);
    }
}
