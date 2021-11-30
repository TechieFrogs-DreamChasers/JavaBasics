package com.coll.set.hashset;

import java.util.HashSet;

public class DemoHashSet {
    public static void main(String[] args) {
        HashSet<Integer> integers=new HashSet<>();
        for(int i=0;i<20;i++){
            integers.add((int)(Math.random()*5000+1));
        }
        System.out.println("Integer HashSet: "+integers);
        HashSet<Integer> even_Set=new HashSet<>();
        HashSet<Integer> odd_Set=new HashSet<>();
        for(Integer i:integers){
            if(i%2==0)
                even_Set.add(i);
            else
                odd_Set.add(i);
        }
        System.out.println("Even Set: "+even_Set);
        System.out.println("Odd Set: "+odd_Set);

    }
}
