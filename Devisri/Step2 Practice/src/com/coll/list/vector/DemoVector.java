package com.coll.list.vector;

import java.util.*;

//Vector using heterogeneous data and iterations
public class DemoVector {
    public static void main(String[] args) {
        List list=new Vector();

        list.add(10011);
        list.add("John");
        list.add(29);
        list.add("john@email.com");
        list.add(9623580529L);

        List list2=new Vector();

        list2.add(10012);
        list2.add("Sam");
        list2.add(32);
        list2.add("sam@email.com");
        list2.add(8256580529L);

        List list3=new Vector();

        list3.add(10013);
        list3.add("Meghan");
        list3.add(30);
        list3.add("meghan@email.com");
        list3.add(9620257829L);

        List list4=new Vector();

        list4.add(10014);
        list4.add("Bob");
        list4.add(25);
        list4.add("bob@email.com");
        list4.add(7896580529L);

        List list5=new Vector();

        list5.add(10015);
        list5.add("Tom");
        list5.add(40);
        list5.add("tom@email.com");
        list5.add(9623563028L);

        Vector list6=new Vector();

        list6.add(10016);
        list6.add("Jim");
        list6.add(35);
        list6.add("jim@email.com");
        list6.add(9625387028L);

        System.out.println("Normal list as String rep: ");
        System.out.println(list);
        System.out.println(" ");
        //Iterating using normal for
        System.out.println("Normal For: ");
        for(int i=0;i< list2.size();i++){
            System.out.println(list2.get(i));
        }
        System.out.println(" ");

        System.out.println("Enhanced For: ");
        for(Object o:list3){
            System.out.println(o);
        }
        System.out.println(" ");

        System.out.println("Using Iterator: ");
        Iterator iterator=list4.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(" ");

        System.out.println("Using ListIterator: ");
        ListIterator listIterator=list5.listIterator();

        System.out.println("Forward direction");
        while (listIterator.hasNext())
            System.out.println(listIterator.next());

        System.out.println("Backward direction");
        while (listIterator.hasPrevious())
            System.out.println(listIterator.previous());
        System.out.println(" ");

        System.out.println("Using Enumerator: ");
        Enumeration elements=list6.elements();
        while (elements.hasMoreElements())
            System.out.println(elements.nextElement());
    }
}
