package com.Practice.Interface.RulesFeatures;
//we can have nested interface
@FunctionalInterface
public interface ModelB{
    //functional interface=Single abstract method
    void div();
    //void sub();
    //nested interface
    interface Inner{
        //abstract method
        void work();
    }
    //nested class = public+static => by default. But not abstract.
    // We have to specify if we want an abstract,final class
      class InnerC{
        InnerC(){
            System.out.println("Constructor of InnerC. Nested class in ModelB Interface");
        }
        //any access modifier can be used even private
        //final not allowed, abstract & static,by default
        interface Inner2{
            //default method in interface
            default void inn2(){
                System.out.println("inn2() method in inner2 interface in nested InnerC class ");
            }
        }
    }

    public static void main(String[] args) {
        //Providing implementation for functional interface
        ModelB modelB=()->System.out.println("This is SAM/Single Abstract Method/Functional interface");
        modelB.div();
    }

}
