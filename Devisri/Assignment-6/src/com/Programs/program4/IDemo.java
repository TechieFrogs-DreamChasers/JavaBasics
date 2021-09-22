package com.Programs.program4;

public interface IDemo {
    int x=100;
    String name="Demo";
    float pi=3.14f;
    char option='1';
    boolean isDemo = false;

    public static void main(String[] args) {
        /*
        IDemo.x=5;
        IDemo.name="Not Demo";
        IDemo.pi=2.14f;
        IDemo.option='5';
        IDemo.isDemo=true;

        EveryLine in this main() is error. Because final fields once initilized cannot be changed;
        They are static so without object creation, variable can be accessed with interface name;
        */
    }

}
