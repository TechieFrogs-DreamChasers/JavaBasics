package com.java8.practice.stream;

import java.util.*;

public class ObjectsForCollections {
    public static List<String> stringList(){
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Brad");
        names.add("Thomas");
        names.add("Meghan");
        names.add("Frank");
        names.add("Yvonne");
        names.add("Greene");
        names.add("Clay");
        names.add("Henry");
        names.add("Paul");
        return names;
    }
    public static List<Integer> integerList(){
        List<Integer> numbers=new ArrayList<>();
        for(int i=0;i<10;i++)
            numbers.add((int)(Math.random()*50+1));
        return numbers;
    }
    public static List<Character> characterList(){
        List<Character> characters=new ArrayList<>();
        characters.add('J');
        characters.add('S');
        characters.add('T');
        characters.add('U');
        characters.add('H');
        characters.add('W');
        characters.add('K');
        characters.add('L');
        characters.add('N');
        characters.add('A');
        return characters;
    }
    public static Set<String> stringSet(){
        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("Brad");
        names.add("Thomas");
        names.add("Meghan");
        names.add("Frank");
        names.add("Yvonne");
        names.add("Greene");
        names.add("Clay");
        names.add("Henry");
        names.add("Paul");
        return names;
    }
    public static Set<Integer> integerSet(){
        Set<Integer> numbers=new HashSet<>();
        for(int i=0;i<10;i++)
            numbers.add((int)(Math.random()*50+1));
        return numbers;
    }
    public static Set<Character> characterSet(){
        Set<Character> characters=new HashSet<>();
        characters.add('J');
        characters.add('S');
        characters.add('T');
        characters.add('U');
        characters.add('H');
        characters.add('W');
        characters.add('K');
        characters.add('L');
        characters.add('N');
        characters.add('A');
        return characters;
    }
    public static Map<String,String> cities_Country(){
        Map<String,String> city_Country=new HashMap<>();
        city_Country.put("Berlin","Germany");
        city_Country.put("New York","USA");
        city_Country.put("Sydney","Australia");
        city_Country.put("Rome","Italy");
        city_Country.put("Barcelona","Spain");
        city_Country.put("London","UK");
        city_Country.put("Paris","France");
        city_Country.put("Quebec","Canada");
        city_Country.put("Mumbai","India");
        city_Country.put("Tokyo","Japan");
        return city_Country;
    }
}
