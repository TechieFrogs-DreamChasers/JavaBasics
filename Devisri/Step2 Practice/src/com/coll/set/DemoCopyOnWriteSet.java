package com.coll.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class DemoCopyOnWriteSet {
    public static void main(String[] args) {
        HashSet<Character> characters=new HashSet<>();
        characters.add('a');
        characters.add('e');
        characters.add('i');
        characters.add('o');
        characters.add('u');
        System.out.println(characters);
        Iterator<Character> iterator=characters.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            //iterator.remove();
            //characters.add('A');CME
        }
        System.out.println(characters);//if line 19 exists then output->[]
        CopyOnWriteArraySet<Character> vowels=new CopyOnWriteArraySet<>();
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        System.out.println(vowels);
        Iterator<Character> itr=vowels.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
            //itr.remove();//UOE
            vowels.add('a');
            vowels.remove('a');
        }
        System.out.println(vowels);//[A, E, I, O, U]
    }
}
