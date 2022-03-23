package com.newPractice.collections.ALcodingQ.q4;

import java.util.Comparator;

public class SortByAge implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEmp_Age()-o2.getEmp_Age();
    }
}
