package com.newPractice.collections.myprograms.maps;

import java.util.Comparator;

public class SortByIsWorking implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Boolean.compare(o1.getWorking(),o2.getWorking());
    }
}
