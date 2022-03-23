package com.coll.maps.step2.LHM.tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharsFromString {
    public static void main(String[] args) {
        Map<Character,Integer> chars_Map=new LinkedHashMap<>();
        String word="amalgamation";
        char[] letters=word.toCharArray();
        for(char ch:letters){
            if(chars_Map.containsKey(ch))
                chars_Map.put(ch,chars_Map.get(ch)+1);
            else
                chars_Map.put(ch,1);
        }
        for(Map.Entry<Character,Integer> pair:chars_Map.entrySet()){
            if(pair.getValue()==1)
                System.out.println(pair.getKey());

        }

    }
}
