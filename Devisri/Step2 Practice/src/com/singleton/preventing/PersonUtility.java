package com.singleton.preventing;

public class PersonUtility implements Cloneable{
    private static Person person=null;

    private PersonUtility() {
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton Pattern Prevention");
    }

    public static Person createInstance(){
        if(person==null){
            person=new Person();
        }
        return person;
    }
}
