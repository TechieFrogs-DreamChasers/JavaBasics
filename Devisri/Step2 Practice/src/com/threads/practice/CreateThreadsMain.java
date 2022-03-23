package com.threads.practice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CreateThreadsMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FirstThread firstThread = new FirstThread();
        firstThread.start();

        Runnable runnable = new SecondThread();
        Thread thread = new Thread(runnable);
        thread.start();

        ExecutorService service = Executors.newFixedThreadPool(5);
        Future<Boolean> future = service.submit(new ThirdThread());
        System.out.println(">>> From Third Thread: "+future.get());

        Thread fourthThread = new FourthThread() {
            @Override
            public void run() {
                FourthThread.executeDoubles(25);
            }

        };
        fourthThread.start();

        //Using java8

        Runnable r = ()->{
          Operations.executeCubes(10);
        };
        Thread t = new Thread(r);
        t.start();
    }
}
