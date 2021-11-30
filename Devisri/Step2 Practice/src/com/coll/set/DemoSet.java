package com.coll.set;

import java.util.*;

public class DemoSet {
    public static void main(String[] args) {
        Set<String> colors_Set=new HashSet<>();
        //add()
        colors_Set.add("Red");
        colors_Set.add("White");
        colors_Set.add("Blue");
        colors_Set.add("Black");
        colors_Set.add("Pink");
        colors_Set.add("Red");
        colors_Set.add("White");
        colors_Set.add("Blue");
        colors_Set.add("null");
        colors_Set.add("null");
        //display via toString()
        System.out.println("Colors Set: "+colors_Set);
        //Colors Set: [Red, White, Pink, null, Blue, Black]
        //Set is not ordered and does not allow duplicate and more than one null value
        System.out.println("Length: "+colors_Set.size());//6
        colors_Set.add("Green");
        colors_Set.add("Yellow");
        colors_Set.add("Cyan");
        colors_Set.add("Orange");
        System.out.println("Updated Set: "+colors_Set);
        System.out.println("Updated Set length: "+colors_Set.size());
        //Traversing using normal for is not possible for set as there is no get()
        //Traversing via Enhanced For
        System.out.println("Traversing via Enhanced For: ");
        for(String color:colors_Set)
            System.out.println(color);
        System.out.println(" ");
        System.out.println("Traversing via Iterator: ");
        Iterator<String> iterator=colors_Set.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        //Converting Set to Array
        System.out.println("");
        String[] colors=colors_Set.toArray(new String[colors_Set.size()]);
        System.out.println("Set to Array: "+Arrays.toString(colors));
        //Array to Set
        Set<String> color_Set=new HashSet<>(Arrays.asList(colors));
        System.out.println("Array to Set: "+color_Set);
        //Another way
        Set<String> strings_colors_set=new HashSet<>();
        Collections.addAll(strings_colors_set,colors);
        System.out.println("Array to Set via Collections.addAll(): "+strings_colors_set);
        //Set To List
        List<String> list_Of_Colors=new ArrayList<>(colors_Set);
        System.out.println("Set To List: "+list_Of_Colors);
        //Sort a set
        //Converting set to list and sort using Collections.sort()
        Collections.sort(list_Of_Colors);
        System.out.println("After sorting: "+list_Of_Colors);
        //A set of multiple values
        Set<List<String>> strSet = new HashSet<List<String>>();
        strSet.add(list_Of_Colors);
        System.out.println(strSet);
    }
}
