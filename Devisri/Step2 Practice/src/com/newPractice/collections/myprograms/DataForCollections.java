package com.newPractice.collections.myprograms;

import java.util.*;

public class DataForCollections {
    public static List<String> getColorsList(){
        List<String> colors = new ArrayList<>();
        Collections.addAll(colors,"Red","Black","Pink","Blue","Yellow","Green","Cyan",
                "Purple","Orange","White");
        return colors;
    }
    public static Set<String> getNamesSet(){
        Set<String> names = new HashSet<>();
        Collections.addAll(names,"Rose","Brad","Phillip","Brain","Shaun","Grace","Chad",
                "Paul","Olivia","Will");
        return names;
    }
    public static List<Integer> getNumbersList(){
        List<Integer> numbers = new ArrayList<>();
        for(int i=0;i<10;i++)
            numbers.add((int)(Math.random()*200+2));
        return numbers;
    }
    public static Set<Integer> getNumbersSet(){
        Set<Integer> numbers = new HashSet<>();
        for(int i=0;i<10;i++)
            numbers.add((int)(Math.random()*200+2));
        return numbers;
    }
    public static Map<String,String> getCityCountriesMap(){
        Map<String,String> cityCountries = new HashMap<>();
        cityCountries.put("Vienna","Austria");
        cityCountries.put("Canberra","Australia");
        cityCountries.put("Santiago","Chile");
        cityCountries.put("Havana","Cuba");
        cityCountries.put("Cairo","Egypt");
        cityCountries.put("Paris","France");
        cityCountries.put("Berlin","German");
        cityCountries.put("Sydney","Australia");
        cityCountries.put("Rome","Italy");
        cityCountries.put("Tokyo","Japan");
        return cityCountries;
    }
    public static Map<String,Integer> getItemQuantityMap(){
        Map<String,Integer> itemQuantity = new HashMap<>();
        itemQuantity.put("Lamps",8);
        itemQuantity.put("Ceiling Fans",4);
        itemQuantity.put("Tables",3);
        itemQuantity.put("Chairs",10);
        itemQuantity.put("Vases",6);
        itemQuantity.put("Iron box",1);
        itemQuantity.put("Bed Lamp",6);
        itemQuantity.put("Tissue-Boxes",10);
        itemQuantity.put("Hand Wash",2);
        itemQuantity.put("Radio",1);
        return itemQuantity;
    }
}
