package com.Practice.Interface.RulesFeatures;
//implements ModelA is optional as AModelA implements ModelA interface
//Multi-level end child does nor require the implementation as AModelA already implements the interface.
//CModelA=concrete class
//AModelA=Abstract class
//ModelA=Interface
public class CModelA extends AModelA implements ModelA{

    @Override
    void display() {
        System.out.println("AModelA display() method implementation");
    }
    //method implementation from ModelA
    @Override
    public void details() {

    }
    //default/instance method from ModelA
    @Override
    public void add() {
        super.add();
    }

    public static void main(String[] args) {


    }
}
//ModelB.InnerC= Nested class which have a method inn2 inside a nested interface Inner2
//ModelB.Inner= Nested interface Inner. This only have an abstract method work()
//ModelB.InnerC.Inner2= Inner2 interface is inside nested class InnerC which is in ModelB Interface
class CModelC extends ModelB.InnerC  implements ModelB.Inner, ModelB.InnerC.Inner2 {
    @Override
    public void inn2() {
        //Inner2.super.inner2();
        System.out.println("This is inn2() in CModelC as overridden method");
    }

    @Override
    public void work() {
        System.out.println("This is an implementation of Inner interface in ModelB");
    }

    public static void main(String[] args) {
        CModelC cmc=new CModelC();
        cmc.work();
        cmc.inn2();//default/instance method
    }
}

