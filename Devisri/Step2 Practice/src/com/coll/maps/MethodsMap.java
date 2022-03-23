package com.coll.maps;

import java.util.HashMap;
import java.util.Map;

public class MethodsMap {
    public static void main(String[] args) {
        Map<String,String> cities_Country=new HashMap<>();
        //put() to add values
        cities_Country.put("Sydney","Australia");
        cities_Country.put("Rome","Italy");
        cities_Country.put("Melbourne","Australia");
        cities_Country.put("Venice","Italy");
        cities_Country.put("Madrid","Spain");
        cities_Country.put("New York","USA");
        cities_Country.put("Paris","France");
        cities_Country.put("Barcelona","Spain");
        //map allows single null key and multiple null values
        cities_Country.put(null,null);
        cities_Country.put("London",null);
        //get() to retrieve values
        System.out.println("get(): "+cities_Country.get(null));
        System.out.println("get(): "+cities_Country.get("Venice"));
        //getOrDefault() retrieves values if present else displays given message
        System.out.println("getOrDefault(): "+cities_Country.getOrDefault("Florence","Key does not exist"));
        System.out.println("getOrDefault(): "+cities_Country.getOrDefault("Paris","Key doest not exist"));
        //containsKey(),containsValue() checks whether key/Value exists or not
        System.out.println("containsKey(): "+cities_Country.containsKey("Barcelona"));
        System.out.println("containsKey(): "+cities_Country.containsKey("Berlin"));
        System.out.println("containsValue(): "+cities_Country.containsValue(null));
        System.out.println("containsValue(): "+cities_Country.containsValue("UK"));
        //remove(key),remove(object,key)
        System.out.println(cities_Country);
        System.out.println("Original size(): "+cities_Country.size());
        System.out.println("remove(key): "+cities_Country.remove(null));
        System.out.println(cities_Country);
        System.out.println("First time remove size(): "+cities_Country.size());
        System.out.println("remove(key): "+cities_Country.remove(null));
        System.out.println(cities_Country);
        System.out.println("Second time remove size(): "+cities_Country.size());
        System.out.println(cities_Country);
        System.out.println("remove(key,object): "+cities_Country.remove("New York","USA"));
        System.out.println("After remove(key,object): "+cities_Country);
        System.out.println("remove(key,object): "+cities_Country.remove("null","USA"));
        System.out.println("After second time remove(key,object): "+cities_Country);
        //replace()
        System.out.println("replace(): "+cities_Country.replace("London","UK"));
        System.out.println(cities_Country);
        System.out.println("Overloaded replace(): "+cities_Country.replace("London","UK","United Kingdom"));
        System.out.println(cities_Country);
        Map<Character,String> vowel_Consonant=new HashMap<>();
        vowel_Consonant.put('a',"Vowel");
        vowel_Consonant.put('s',"Consonant");
        vowel_Consonant.put('c',"Consonant");
        vowel_Consonant.put('e',"Vowel");
        vowel_Consonant.put('i',"Vowel");
        vowel_Consonant.put('t',"Consonant");
        vowel_Consonant.put('u',"Vowel");
        vowel_Consonant.put('o',"Vowel");
        vowel_Consonant.put('n',"Consonant");
        vowel_Consonant.put('l',"Consonant");
        System.out.println(vowel_Consonant);
        Map<Character,String> consonants=new HashMap<>();
        consonants.put('B',"Consonant");
        consonants.put('s',"Consonant");
        consonants.put('c',"Consonant");
        consonants.put('K',"Consonant");
        consonants.put('L',"Consonant");
        consonants.put('X',"Consonant");
        consonants.put('P',"Consonant");
        consonants.put('G',"Consonant");
        consonants.put('n',"Consonant");
        consonants.put('l',"Consonant");
        System.out.println(consonants);
        //putAll()
        vowel_Consonant.putAll(consonants);
        System.out.println("After putAll(): "+vowel_Consonant);
        System.out.println("After putAll(): "+consonants);
        //putIfAbsent()
        System.out.println("putIfAbsent(): "+consonants.putIfAbsent('x',"Consonant"));
        System.out.println("After putIfAbsent(): "+consonants);
        System.out.println("putIfAbsent(): "+consonants.putIfAbsent('G',"Consonant"));
        System.out.println("After putIfAbsent(): "+consonants);
    }
}
