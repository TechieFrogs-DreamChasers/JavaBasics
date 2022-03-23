package com.coll.maps.step2.LHM.tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatedCharInString {
    public static void main(String[] args) {
        Map<Character,Integer> chars_map=new LinkedHashMap<>();
        String word="Binging";
        char[] letters=word.toCharArray();
        for(char ch:letters){
            if(chars_map.containsKey(ch))
                chars_map.put(ch, chars_map.get(ch)+1);
            else
                chars_map.put(ch,1);
        }
        for(Map.Entry<Character,Integer> pair:chars_map.entrySet()){
            if(pair.getValue() > 1){
                System.out.println(pair.getKey());
                break;
            }
        }
    }
}
