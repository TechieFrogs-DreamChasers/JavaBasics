package com.Practice.Interface.NestedInterfaces;
//Nested Interface
//inner interface has to be public
public interface Outer {
    void m1();//outer interface method

    //By default, inner interface is public
    public interface Inner {
        void m2();//inner interface method
    }
}
