package com.newPractice.collections.ALcodingQ.q4;

import java.util.Comparator;

public class SortById implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEmp_Id()-o2.getEmp_Id();
    }
}
