package com.Practice.Interface.RulesFeatures;
//CModelB=concrete class
//AModelB=Abstract class
//ModelA,ModelB,ModelC= interfaces

public class CModelB extends AModelB implements ModelA,ModelB,ModelC {
   //Method implementation from ModelA
    @Override
    public void details() {

    }
    //default/Instance Method from ModelA interface
    @Override
    public void add() {
        
    }
    //abstract method implementation from AModelA abstract class
    @Override
    void display() {

    }
    //Method implementation from ModelB interface
    @Override
    public void div() {

    }
    // instance method from this class
    public void mod() {

    }
}
