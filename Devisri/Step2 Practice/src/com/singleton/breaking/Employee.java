package com.singleton.breaking;

public class Employee extends SingletonClone {
    private int emp_Id;
    private String emp_Name;
    private double salary;
    private String employment_Type;

    public int getEmp_Id() {
        return emp_Id;
    }

    public void setEmp_Id(int emp_Id) {
        this.emp_Id = emp_Id;
    }

    public String getEmp_Name() {
        return emp_Name;
    }

    public void setEmp_Name(String emp_Name) {
        this.emp_Name = emp_Name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmployment_Type() {
        return employment_Type;
    }

    public void setEmployment_Type(String employment_Type) {
        this.employment_Type = employment_Type;
    }

    @Override
    public String toString() {
        return getEmp_Name()+"\t"+getEmp_Id()+"\t"+getSalary()+"\t"+getEmployment_Type();
    }
}
