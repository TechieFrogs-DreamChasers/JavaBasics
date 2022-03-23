package com.java8.practice.methodref;

public class DemoMethodReferences {
    public static void main(String[] args) {
        //Lambda Expression way
        System.out.println("Lambda Expression way: ");
        IvoidReturn ivoidReturn=()-> System.out.println("Method Reference Demo");
        ivoidReturn.display();
        //Method Reference way
        //Static Method
        System.out.println();
        System.out.println("Method Reference way - Static Method: ");
        IvoidReturn iobj=Sample::show;
        iobj.display();
        //Instance Method
        System.out.println();
        System.out.println("Method Reference way - Instance Method: ");
        Sample sample = new Sample();
        IvoidReturn iob2 = sample::details;
        iob2.display();
        System.out.println();
        //Constructor
        System.out.println("Method Reference way - Constructor: ");
        IvoidReturn iob3 = Sample::new;
        iob3.display();

    }
}
