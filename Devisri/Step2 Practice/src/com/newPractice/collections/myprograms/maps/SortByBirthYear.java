package com.newPractice.collections.myprograms.maps;

import java.util.Comparator;

public class SortByBirthYear implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getBirthYear()- o2.getBirthYear();
    }
}
