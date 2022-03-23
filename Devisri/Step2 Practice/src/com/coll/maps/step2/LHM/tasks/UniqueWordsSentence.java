package com.coll.maps.step2.LHM.tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueWordsSentence {
    public static void main(String[] args) {
        Map<String,Integer> word_map=new LinkedHashMap<>();
        String sentence="we few we happy few we band of brothers";
        String[] words=sentence.split(" ");
        for(String s:words){
            if(word_map.containsKey(s))
                word_map.put(s,word_map.get(s)+1);
            else
                word_map.put(s,1);
        }
        for(Map.Entry<String,Integer> pair: word_map.entrySet()){
            if(pair.getValue() == 1)
                System.out.println(pair.getKey());
        }
    }
}
