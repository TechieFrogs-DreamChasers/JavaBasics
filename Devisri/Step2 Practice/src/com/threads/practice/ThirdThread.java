package com.threads.practice;

import java.util.concurrent.Callable;

public class ThirdThread implements Callable{

    @Override
    public Object call() throws Exception {
        return Operations.executeBooleans("Main","main");
    }
}
