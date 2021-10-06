package com.Practice.Abstraction.Caluclations;
//Hierarchical level+ Multi-level
public abstract class Caluclator {
    public Caluclator() {
        System.out.println("Constructor in abstract super class Calculator!!!");
    }
    public abstract void calculate(int a,int b);
    public abstract void calculate(String a,int b);
}
