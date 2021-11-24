package com.coll.comparator.sorts;

import java.util.Comparator;

public class SortViaName implements Comparator<MyLibrary> {
    @Override
    public int compare(MyLibrary o1, MyLibrary o2) {
        return o1.getBook_Name().compareTo(o2.getBook_Name());
    }
}
