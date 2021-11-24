package com.coll.comparator.sorts;

import java.util.Comparator;

public class SortViaYear implements Comparator<MyLibrary> {
    @Override
    public int compare(MyLibrary o1, MyLibrary o2) {
        if(o1.getBook_release_Year() > o2.getBook_release_Year())
            return 1;
        else if(o1.getBook_release_Year() < o2.getBook_release_Year())
            return -1;
        else
            return 0;
    }
}
