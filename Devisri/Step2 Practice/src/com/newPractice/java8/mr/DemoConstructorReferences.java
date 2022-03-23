package com.newPractice.java8.mr;

public class DemoConstructorReferences {
    public static void main(String[] args) {
        IBookReference ref = Book::new;
        Book book = ref.fetchAllBooks("Six Of Crows", "Leigh Bardugo");
        System.out.println(book);
        //IBookReference refe = (a,b)->System.out::println;
    }
}
