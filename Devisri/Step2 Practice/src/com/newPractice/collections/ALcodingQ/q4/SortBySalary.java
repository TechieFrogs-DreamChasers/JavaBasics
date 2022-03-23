package com.newPractice.collections.ALcodingQ.q4;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getEmp_Salary()-o2.getEmp_Salary());
    }
}
