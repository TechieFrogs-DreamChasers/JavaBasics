package com.newPractice.collections.ALcodingQ.q4;

import java.util.Comparator;

public class SortByName implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEmp_Name().compareTo(o2.getEmp_Name());
    }
}
