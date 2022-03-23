package com.newPractice.collections.myprograms;

import java.util.*;

public class DemoCollectionsMethods {
    public static void main(String[] args) {
        List<String> list = DataForCollections.getColorsList();
        System.out.println("List: "+list);
        //sorting
        Collections.sort(list);
        System.out.println("Sorted List: "+list);
        System.out.println("binarySearch(c,e): "+Collections.binarySearch(list, "Cyan"));
        //shuffle
        Collections.shuffle(list);
        System.out.println("Shuffle: "+list);
        //rotate
        Collections.rotate(list,5);
        System.out.println("rotate: "+list);
        //replaceAll
        Collections.replaceAll(list,"Purple","Violet");
        System.out.println("replaceAll: "+list);
        List<Integer> numbers = DataForCollections.getNumbersList();
        //reverse
        System.out.println("Numbers List: "+numbers);
        Collections.reverse(numbers);
        System.out.println("Reverse List: "+numbers);
        Collections.sort(numbers);
        System.out.println("Sorted Numbers List: "+numbers);
        Collections.reverse(numbers);
        System.out.println("Reverse Sorted List: "+numbers);
        //swap
        Collections.swap(numbers,4,8);
        System.out.println("Swapped Numbers: "+numbers);
        //frequency
        System.out.println("frequency: "+Collections.frequency(numbers,24));
        //min,max
        System.out.println("max: "+Collections.max(numbers));
        System.out.println("min: "+Collections.min(numbers));
        //disjoint
        ArrayList<String> names_1 = new ArrayList<>();
        names_1.add("Anne");
        names_1.add("Brad");
        names_1.add("Chad");
        names_1.add("Drew");
        ArrayList<String> names_2 = new ArrayList<>(names_1);
        /*names_2.add("Anne");
        names_2.add("Brad");
        names_2.add("Chad");
        names_2.add("Drew");*/
        System.out.println("disjoint: "+Collections.disjoint(names_1,names_2));
        System.out.println("names_1: "+names_1);
        System.out.println("names_2: "+names_2);
        Deque<String> names_3=new ArrayDeque<>();
        names_3.add("Anne");
        names_3.add("Brad");
        names_3.add("Chad");
        names_3.add("Drew");
        names_3.add("Emma");
        Queue<String> ts = Collections.asLifoQueue(names_3);
        ts.add("Frank");
        System.out.println("asLifoQue: "+ts);
        System.out.println("CheckedList: "+Collections.checkedList(new ArrayList<>(names_1.size()), String.class).addAll(names_1));
        Enumeration<String> enm = Collections.enumeration(list);
        while (enm.hasMoreElements())
            System.out.println("Enumeration: "+enm.nextElement());
    }
}
