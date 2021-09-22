package com.Practice.Interface.RulesFeatures;
/*
AModelB=abstract class
AModelA=abstract class
ModelC=Interface
 */
public class AModelB extends AModelA implements ModelC {
    //method from ModelC interface
    @Override
    public void details() {

    }
    //Method from ModelC
    @Override
    public void add() {
        ModelC.super.add();
    }
    //Method from AModelA
    @Override
    void display() {

    }
    //Method from ModelB as ModelC extends ModelB
    @Override
    public void div() {

    }
    //instance method of this AModelB abstract class
    public void mod() {

    }
}
