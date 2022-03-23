package com.newPractice.collections.myprograms.queues;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class WaysOfQue {
    public static void main(String[] args) {
        Queue<Double> gpas = new LinkedList<>();
        gpas.offer(3.0);
        gpas.offer(2.9);
        gpas.offer(1.5);
        gpas.offer(4.2);
        gpas.offer(3.5);
        gpas.offer(4.1);
        gpas.add(null);
        gpas.offer(null);
        while (!gpas.isEmpty()){
            System.out.println(gpas.poll());
        }
        System.out.println();
        Queue<Double> gpaQue = new PriorityQueue<>();
        gpaQue.offer(3.0);
        gpaQue.offer(2.9);
        gpaQue.offer(1.5);
        gpaQue.offer(4.2);
        gpaQue.offer(3.5);
        gpaQue.offer(4.1);
        while (!gpaQue.isEmpty())
            System.out.println(gpaQue.poll());
        System.out.println();
        Iterator<Double> itr = gpaQue.iterator();
        while (itr.hasNext())
            System.out.println("PQ: "+itr.next());
        System.out.println();
        Queue<String> queue = new LinkedList<>();
        queue.offer("Car");
        queue.offer("Bike");
        queue.add("Truck");
        queue.add("Zeep");
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.element());
        System.out.println(queue);
        queue.clear();
        System.out.println(queue.poll());
       // System.out.println(queue.element());//NoSuchElementException
        queue.add("Meghan");
        queue.add("Lionel");
        queue.add("Karen");
        queue.add("Chad");
        queue.add("Nina");
        System.out.println(queue);
        System.out.println();
        Queue<String> grades = new PriorityQueue<>(Collections.reverseOrder());
        grades.add("B");
        grades.add("A");
        grades.add("C");
        grades.add("A");
        grades.add("B");
        grades.add("C");
        System.out.println(grades);
        System.out.println();
        BlockingQueue<String> vehicles = new ArrayBlockingQueue<>(5);
        Collections.addAll(vehicles,"Cars","Truck","Jeep","Bike","Bicycle");
        for(String vehicle: vehicles){
            System.out.println("Vehicle: "+vehicle);
        }
        //ArrayBlockingQueue<String> q = new ArrayBlockingQueue<>();
        ArrayDeque<String> q = new ArrayDeque<>(vehicles);
        System.out.println(q);

    }
}
