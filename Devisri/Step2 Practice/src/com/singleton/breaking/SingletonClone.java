package com.singleton.breaking;

public class SingletonClone implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
