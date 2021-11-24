package com.coll.comparator.sorts;

import java.util.ArrayList;
import java.util.Collections;

public class MyLibraryMain {
    public static void main(String[] args) {
        ArrayList<MyLibrary> library=new ArrayList<>();
        library.add(new MyLibrary(10021,"Six of Crows","Leigh Bardugo","Y/A Fantasy",2015));
        library.add(new MyLibrary(10025,"Crooked Kingdom","Leigh Bardugo","Y/A Fantasy",2016));
        library.add(new MyLibrary(10022,"The Way Of Kings","Brandon Sanderson","High Fantasy",2010));
        library.add(new MyLibrary(10024,"The Blade Itself","Joe Abercrombie","Fantasy",2006));
        library.add(new MyLibrary(10023,"OathBringer","Brandon Sanderson","Fantasy",2017));
        System.out.println("Sort Asc order via id: ");
        Collections.sort(library,new SortViaId());
        System.out.println(library);
        System.out.println("Sort Asc order via name: ");
        Collections.sort(library,new SortViaName());
        System.out.println(library);
        System.out.println("Sort Asc order via author: ");
        Collections.sort(library,new SortViaAuthor());
        System.out.println(library);
        System.out.println("Sort Asc order via genre: ");
        Collections.sort(library,new SortViaGenre());
        System.out.println(library);
        System.out.println("Sort Asc order via year: ");
        Collections.sort(library,new SortViaYear());
        System.out.println(library);
    }
}
