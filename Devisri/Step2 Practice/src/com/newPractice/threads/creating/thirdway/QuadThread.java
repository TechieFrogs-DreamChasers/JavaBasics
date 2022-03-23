package com.newPractice.threads.creating.thirdway;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;

public class QuadThread implements Callable {
    @Override
    public String call() throws Exception {
        return displayQuadNumbers(50);
    }
    public String displayQuadNumbers(int range){
        CopyOnWriteArrayList<Integer> list =new CopyOnWriteArrayList<>();
        for(int i=1;i<=range;i++){
            if(i%2==0)
               list.add(i*i*i*i);
            else
              list.add(i);
        }
        return ">>>Quad Thread: "+Thread.currentThread().getName()+"--> "+list;
    }
}
