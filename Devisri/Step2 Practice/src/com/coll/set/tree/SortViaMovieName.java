package com.coll.set.tree;

import java.util.Comparator;

public class SortViaMovieName implements Comparator<Movies> {
    @Override
    public int compare(Movies o1, Movies o2) {
        return o1.getMovie_Name().compareTo(o2.getMovie_Name());
    }
}
