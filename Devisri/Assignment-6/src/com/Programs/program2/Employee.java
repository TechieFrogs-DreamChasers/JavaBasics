package com.Programs.program2;

public class Employee implements IMeasurable{
    @Override
    public double getMeasure(double cm) {
        return cm;
    }
    double average(double[] objects){
        int sum=0;
        for (int i=0;i<objects.length;i++){
            sum+=objects[i]/objects.length;
        }
        return sum;
    }

    double avg_Salary(double[] employees){
        double average=0;
        for (int i=0;i<employees.length;i++){
            average=(employees[i]/employees.length);
        }
        return average;
    }

    public static void main(String[] args) {
        Employee emp=new Employee();
        System.out.println("The Card measurement: "+emp.getMeasure(78.0)+"cm.");
        double[] objects=new double[]{35.0,48.0,18.0,7.0,10.5};
        System.out.println("The average measurement of objects: "+emp.average(objects));
        double[] salaries=new double[]{50000.0,60000.0,70000.0,40000.0,20000.0};
        System.out.println("The average of Employee Salaries: "+emp.avg_Salary(salaries));
    }
}
