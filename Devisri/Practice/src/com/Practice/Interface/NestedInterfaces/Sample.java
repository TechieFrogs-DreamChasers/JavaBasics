package com.Practice.Interface.NestedInterfaces;

public class Sample implements Outer{
    //Sample class implements only outer interface methods. So inner interface methods are not visible.
    @Override
    public void m1() {
        System.out.println("Sample <-- Outer --> m1()-->Implementation");
    }

}

class Sample2 implements Outer.Inner{
    //Sample2 class implements inner interface methods. So outer interface methods are not visible
    @Override
    public void m2() {
        System.out.println("Sample2 <-- Outer.Inner --> m2()-->Implementation");
    }
}

class Sample3 extends Sample2 implements Outer{
    //This came from inheritance concept. Sample3 extends Sample2.
    //Sample2 has m2() implementation
    @Override
    public void m2() {
        super.m2();
        System.out.println("Sample3 <-- Sample2 --> m2()-->Override");
    }
    //This came from outer interface implementation
    @Override
    public void m1() {
        System.out.println("Sample3 <-- Outer --> m1()-->Implementation");
    }
}
