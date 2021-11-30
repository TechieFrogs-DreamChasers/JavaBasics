package com.coll.set.tree;

import java.util.Comparator;

public class SortViaMovieYear implements Comparator<Movies> {

    @Override
    public int compare(Movies o1, Movies o2) {
        return o1.getMovie_Release_Year()-o2.getMovie_Release_Year();
    }
}
