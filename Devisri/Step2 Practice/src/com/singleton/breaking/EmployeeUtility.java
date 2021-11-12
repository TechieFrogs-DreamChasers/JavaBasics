package com.singleton.breaking;

public class EmployeeUtility extends SingletonClone{
    private static Employee employee=null;

    private EmployeeUtility() {
    }

    public static Employee createInstance(){
        if(employee==null){
            employee=new Employee();
        }
        return employee;
    }

}
