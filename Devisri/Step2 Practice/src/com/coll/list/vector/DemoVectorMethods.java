package com.coll.list.vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class DemoVectorMethods {
    public static void main(String[] args) {
        Vector<Integer> integers=new Vector<>();
        for(int i=0;i<20;i++){
            //add()
            integers.add(i+1);
        }
        System.out.println("add(): "+integers);
        //sublist()
        Vector<Integer> first_Ten= new Vector<>(integers.subList(0,10));
        System.out.println("sublist(): "+first_Ten);
        Vector<Integer> last_Ten=new Vector<>(integers.subList(10,integers.size()));
        System.out.println("sublist(): "+last_Ten);
        //addAll()
        Vector<Integer> numbers_till20=new Vector<>(first_Ten);
        numbers_till20.addAll(last_Ten);
        System.out.println("addAll(): "+numbers_till20);
        //addElement()
        Vector<Integer> even_Numbers=new Vector<>();
        for(int i=0;i< integers.size();i++){
            if(integers.get(i)%2==0)
                even_Numbers.addElement(integers.get(i));
        }
        System.out.println("addElement(): "+even_Numbers);
        //containsAll()
        System.out.println("containsAll(): "+integers.containsAll(numbers_till20));//true
        //copyInto()
        Integer[] numbers=new Integer[integers.size()];
        integers.copyInto(numbers);
        System.out.println("copyInto(): "+ Arrays.toString(numbers));
        //elementAt()
        System.out.println("elementAt(): "+even_Numbers.elementAt(5));
        //firstElement()
        System.out.println("firstElement(): "+even_Numbers.firstElement());
        //lastElement()
        System.out.println("lastElement(): "+first_Ten.lastElement());
        //isEmpty
        Vector<String> names=new Vector<>();
        System.out.println("isEmpty(): "+names.isEmpty());
        //insertElementAt()
        names.insertElementAt("Anne",0);
        System.out.println("insertElementAt(): "+names);
        names.insertElementAt("Bob",1);
        System.out.println("insertElementAt(): "+names);
        names.insertElementAt("Clay",2);
        System.out.println("insertElementAt(): "+names);
        //setElementAt()
        names.setElementAt("Brad",1);
        System.out.println("setElementAt(): "+names);
        //removeElement()
        names.removeElement("Anne");
        System.out.println("removeElement(): "+names);
        names.setElementAt("Anna",0);
        names.insertElementAt("Brad",1);
        names.add("Drew");
        names.add("Ella");
        System.out.println("After adding elements: "+names);
        Vector<Character> letters=new Vector<>();
        for(char ch=65;ch<91;ch++){
            letters.add(ch);
        }
        System.out.println("Vector Alphabets: "+letters);
        //Convert vector to Arraylist
        ArrayList<Character> al_Letters=new ArrayList<>(letters);
        System.out.println("ArrayList Alphabets: "+al_Letters);
    }
}
