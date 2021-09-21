package com.Practice.Interface.Scenarios.scenario3;

public class PerformCalculations implements Calculations{
    public static void main(String[] args) {
        //Member interfaces are implicitly static so they are never considered to be inner classes.
        //So we can't have a local interface.
        //Interface Declaration is not a BlockStatement.
        //An interface is meant to describe behavior, but since the interface would be local,
        // no caller could make use of it.
        // You could just as well define and implement the behavior in a class.
        PerformCalculations pc=new PerformCalculations();
        pc.showCalc();
        pc.showOps();
        Calculations c=new Calculations() {
            @Override
            public void showCalc() {
                Calculations.super.showCalc();
            }

            @Override
            public void showOps() {
                Calculations.super.showOps();
            }
        };
        c.showOps();
        c.showCalc();

    }
}
