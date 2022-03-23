package com.threads.practice;

import java.util.Arrays;

public class FirstThread extends Thread{
    @Override
    public void run() {
        Operations.executeStringOps("Berries are of so many kinds. They maybe Green, Red, Blue and so on.");
    }

}
