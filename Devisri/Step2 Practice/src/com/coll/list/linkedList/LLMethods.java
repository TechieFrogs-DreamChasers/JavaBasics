package com.coll.list.linkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LLMethods {
    public static void main(String[] args) {
        //add(),get() already used
        LinkedList<String> euro_Countries=new LinkedList<>();
        euro_Countries.add("Spain");
        euro_Countries.add("Turkey");
        euro_Countries.add("Italy");
        euro_Countries.add("Belgium");
        euro_Countries.add("Germany");
        System.out.println(euro_Countries);
        //add(index,Obj)
        euro_Countries.add(2,"France");
        euro_Countries.add(4,"Austria");
        euro_Countries.add(1,"Russia");
        euro_Countries.add(3,"Sweden");
        euro_Countries.add(0,"Switzerland");
        System.out.println(euro_Countries);
        //addAll(C)
        LinkedList<Character> first_13_characters=new LinkedList<>();
        for(char ch=65;ch<78;ch++){
            first_13_characters.add(ch);
        }
        System.out.println(first_13_characters);
        LinkedList<Character> last_13_characters=new LinkedList<>();
        for(char ch=78;ch<91;ch++){
            last_13_characters.add(ch);
        }
        System.out.println(last_13_characters);
        LinkedList<Character> characters=new LinkedList<>(first_13_characters);
        characters.addAll(last_13_characters);
        System.out.println(characters);
        LinkedList<Double> doubles=new LinkedList<>();
        //addFirst&addLast()
        doubles.addFirst(523.263);
        doubles.addLast(236.528);
        System.out.println(doubles);
        doubles.addFirst(923.56);
        doubles.addLast(369.25);
        System.out.println(doubles);
        //descendingIterator()
        Iterator<Character> iterator=characters.descendingIterator();
        while (iterator.hasNext())
            System.out.print(iterator.next()+"\t");
        System.out.println(" ");
        //element()
        System.out.println(characters.element());
        //offer(E),offerFirst(E),offerLast(E)
        doubles.offer(1000.0);
        System.out.println(doubles);
        doubles.offerFirst(1500.0);
        doubles.offerLast(2500.0);
        System.out.println(doubles);
        //peek(),peekFirst(),peekLast()
        System.out.println("peek(): "+doubles.peek());
        System.out.println("peekFirst(): "+doubles.peekFirst());
        System.out.println("peekLast(): "+doubles.peekLast());
        //poll(),pollFirst(),pollLast()
        System.out.println("Before Poll Operations: "+doubles);
        System.out.println("poll(): "+doubles.poll());
        System.out.println("After Poll(): "+doubles);
        System.out.println("pollFirst(): "+doubles.pollFirst());
        System.out.println("After PollFirst(): "+doubles);
        System.out.println("pollLast(): "+doubles.pollLast());
        System.out.println("After PollLast(): "+doubles);
        //pop()
        System.out.println("pop(): "+doubles.pop());
        System.out.println("After pop(): "+doubles);
        //push()
        doubles.push(3000.0);
        System.out.println("After push(): "+doubles);
        //removeFirst()
        System.out.println("removeFirst(): "+doubles.removeFirst());
        System.out.println("After removeFirst(): "+doubles);
        //removeFirstOccurrence(),removeLastOccurrence(),removeLast()
        String s="Beginning";
        LinkedList<String> list=new LinkedList<>(Arrays.asList(s.split("")));
        System.out.println(list);
        System.out.println("removeFirstOccurrence(): "+list.removeFirstOccurrence("g"));
        System.out.println("After removeFirstOccurrence(): "+list);
        System.out.println("removeLastOccurrence(): "+list.removeLastOccurrence("n"));
        System.out.println("After removeLastOccurrence(): "+list);
        System.out.println("removeLast(): "+list.removeLast());
        System.out.println("After removeLast(): "+list);
        //set()
        list.set(list.size()-1,"g");
        System.out.println(list);
    }
}
