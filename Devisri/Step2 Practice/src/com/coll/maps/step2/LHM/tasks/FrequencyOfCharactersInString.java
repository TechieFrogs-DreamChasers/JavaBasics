package com.coll.maps.step2.LHM.tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharactersInString {
    public static void main(String[] args) {
        Map<Character,Integer> chars=new LinkedHashMap<>();
        String word="Beginning";
        char[] letters=word.toCharArray();
        for(char ch:letters){
            if(chars.containsKey(ch))
                chars.put(ch, chars.get(ch)+1);
            else
                chars.put(ch,1);
        }
        for(Map.Entry<Character,Integer> pair: chars.entrySet())
            System.out.println(pair.getKey()+" = "+pair.getValue());
    }
}
