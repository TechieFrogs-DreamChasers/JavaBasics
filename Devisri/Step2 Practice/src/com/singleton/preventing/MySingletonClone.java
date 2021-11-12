package com.singleton.preventing;

public class MySingletonClone implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
