package com.Programs.program3.sub2;

import com.Programs.program3.sub.IRemote;

public class AC implements IRemote {
    @Override
    public void powerOn() {
        System.out.println("Air Con is Switched On!!!");
    }

    @Override
    public void increaseVolume() {
        System.out.println("There is no Volume for Air Con!!!");
    }

    @Override
    public void powerOff() {
        System.out.println("Air Con is Switched Off");
    }
}
