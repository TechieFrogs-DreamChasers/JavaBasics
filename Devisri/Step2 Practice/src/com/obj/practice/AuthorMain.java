package com.obj.practice;

public class AuthorMain {
    public static void main(String[] args) {
        Address address = new Address(15, "Chico", "California", "USA", 9592695929L);
        Author author = new Author("Laini Taylor", 49, 36, "Y/A fantasy", address);
        System.out.println(author);
        //Author: 	Laini Taylor	49	Y/A fantasy	36	15	Chico	California	USA	9592695929
        address.setH_No(25);
        System.out.println(author);
        //Author: 	Laini Taylor	49	Y/A fantasy	36	15	Chico	California	USA	9592695929
    }
}
