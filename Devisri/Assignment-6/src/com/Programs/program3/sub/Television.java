package com.Programs.program3.sub;

public class Television implements IRemote{

    @Override
    public void powerOn() {
        System.out.println("Television is switched on!!!");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Television Volume is raised!!!");
    }

    @Override
    public void powerOff() {
        System.out.println("Television is switched off!!!");
    }


}
