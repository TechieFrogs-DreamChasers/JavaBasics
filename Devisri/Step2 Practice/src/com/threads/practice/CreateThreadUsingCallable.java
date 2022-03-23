package com.threads.practice;

import java.util.concurrent.Callable;

public class CreateThreadUsingCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        String s = "Thread creation";
        return s.concat(" using Callable");
    }
}
