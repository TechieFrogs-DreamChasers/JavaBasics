package com.Practice.Interface.RulesFeatures;
/*
*One keyword interface is used to define Interface'
*Interface cannot have any instance variables. It can have only static variables.
*Interface variable must be initialized at the time of declaration otherwise we will get compile-time error.
*No constructor
*can have main method
*we can create reference for interface but not object
 */
public interface ModelA {
    //public static final constants
    int x=700;
    int y=500;
    //can have abstract method
    void details();
    //can have instance/default method
    default void add(){

    }
    //can have static method. can't be inherited
    static void diff(){

    }
    //can have private method. can't be inherited
    private void set(){
        System.out.println("This is set method in ModelA interface");
    }
    public static void main(String[] args) {

    }
}
