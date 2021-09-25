package com.Practice.Interface.RulesFeatures;
/*
*An interface or class can have any number of inner interfaces inside it.
*Inner interface can extend its outer interface.
*Inner and outer interfaces can have method and variables with same name.
*Nested interfaces can also have default and static methods from java 8 onward.
*An inner class defined inside an interface can implement the interface.
*Nesting of interfaces can be done any number of times.
*As a good practice you should avoid doing nesting more than once.
 */

public interface ModelC extends ModelA,ModelB{
    //abstract method in ModelA
    @Override
    void details();
    //default method in ModelA
    @Override
    default void add() {

    }

}
