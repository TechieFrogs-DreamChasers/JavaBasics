package com.coll.maps.step2.LHM.tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class MostRepeatedWordsSentence {
    public static void main(String[] args) {
        Map<String,Integer> word_map=new LinkedHashMap<>();
        String sentence="Hatred was spreading everywhere blood was being spilled everywhere wars were breaking out everywhere";
        String[] words=sentence.split(" ");
        for(String word:words){
            if(word_map.containsKey(word))
                word_map.put(word, word_map.get(word)+1);
            else
                word_map.put(word,1);
        }
        String key=" ";
        int value=0;
        for(Map.Entry<String,Integer> pair:word_map.entrySet()){
            if(pair.getValue() > value){
                key=pair.getKey();
                value=pair.getValue();
            }
        }
        System.out.println(key+" = "+value);
    }
}
