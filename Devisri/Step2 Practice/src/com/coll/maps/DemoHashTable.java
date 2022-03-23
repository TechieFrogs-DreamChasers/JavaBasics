package com.coll.maps;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class DemoHashTable {
    public static <Enumerstion> void main(String[] args) {
        Hashtable<Character,String> vowel_Or_Not=new Hashtable<>();
        vowel_Or_Not.put('a',"Is a Vowel");
        vowel_Or_Not.put('o',"Is a Vowel");
        vowel_Or_Not.put('s',"Is not a Vowel");
        vowel_Or_Not.put('T',"Is not a Vowel");
        vowel_Or_Not.put('U',"Is a Vowel");
        System.out.println(vowel_Or_Not);
        System.out.println(vowel_Or_Not.keySet());
        //enhanced for
        for(Map.Entry<Character,String> pair:vowel_Or_Not.entrySet()){
            System.out.println(pair.getKey()+" = "+pair.getValue());
        }
        //Using Iterator
        Iterator<Map.Entry<Character,String>> iterator=vowel_Or_Not.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            //vowel_Or_Not.put('A',"Vowel");
            //Hashtable iterator is fail-safe
            //vowel_Or_Not.remove('T');
        }
        Enumeration<Character> enumeration=vowel_Or_Not.keys();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
            vowel_Or_Not.remove('T');
        }
        System.out.println(vowel_Or_Not);
        
    }
}
