package com.Programs.program3;

import com.Programs.program3.sub.Television;
import com.Programs.program3.sub2.AC;

public class Main {
    public static void main(String[] args) {
        Television tv=new Television();
        tv.powerOn();
        tv.increaseVolume();
        tv.powerOff();
        System.out.println(" ");
        AC ac=new AC();
        ac.powerOn();
        ac.increaseVolume();
        ac.powerOff();
    }
}
