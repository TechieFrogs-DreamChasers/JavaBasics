package com.coll.maps.step2.LHM.tasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateWordsFile {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String,Integer> word_map=new LinkedHashMap<>();
        File file=new File("C:\\DC Workspace\\src\\com\\coll\\maps\\step2\\LHM\\tasks\\Sample.txt");
        Scanner input=new Scanner(file);
        String sentence;
        ArrayList<String> list=new ArrayList<>();
        while (input.hasNext()){
            sentence=input.next();
            list.add(sentence);
        }
        System.out.println(list);
        System.out.println(list.size());
        for(String s:list){
            if(word_map.containsKey(s))
                word_map.put(s,word_map.get(s)+1);
            else
                word_map.put(s,1);
        }
        for(Map.Entry<String,Integer> pair: word_map.entrySet()){
            if(pair.getValue() > 1){
                System.out.println(pair.getKey()+" = "+pair.getValue());
            }
        }
    }
}
