package com.coll.set.tree;

import java.util.TreeSet;

public class MoviesMain {
    public static void main(String[] args) {
        TreeSet<Movies> movies=new TreeSet<>();
        movies.add(new Movies(106,"The Avengers",2012,"MCU"));
        movies.add(new Movies(104,"Iron Man",2008,"MCU"));
        movies.add(new Movies(103,"Ant-Man",2015,"MCU"));
        movies.add(new Movies(102,"Thor",2011,"MCU"));
        movies.add(new Movies(105,"CA: The Winter Soldier",2014,"MCU"));
        movies.add(new Movies(101,"Captain Marvel",2019,"MCU"));

        //System.out.println(movies);//ClassCastException w/o implementing Comparable/Comparator
        System.out.println("Movie-Id"+"\t"+"Movie-Name"+"\t"+"Movie-Year"+"\t"+"Movie-Genre");
        //sorted using release year using comparable
        for(Movies movie:movies){
            System.out.println(movie);
        }
        System.out.println(" ");
        //sorted using Id/Name/Year using comparator
        TreeSet<Movies> moviesTreeSet=new TreeSet<>(new SortViaMovieName());
        moviesTreeSet.addAll(movies);
        System.out.println("Movie-Id"+"\t"+"Movie-Name"+"\t"+"Movie-Year"+"\t"+"Movie-Genre");
        for(Movies movie:moviesTreeSet)
            System.out.println(movie);

    }
}
