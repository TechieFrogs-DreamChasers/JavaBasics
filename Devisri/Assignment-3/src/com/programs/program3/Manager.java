package com.programs.program3;

public class Manager extends Member {
    private String specialization;
    private String department;

    public Manager(String name, int age, long phone_Number, String address, double salary, String specialization, String department) {
        super(name, age, phone_Number, address, salary);
        this.specialization = specialization;
        this.department = department;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void printSalary() {
        super.printSalary();
    }
}
