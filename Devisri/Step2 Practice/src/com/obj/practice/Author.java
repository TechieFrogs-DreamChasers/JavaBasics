package com.obj.practice;

public final class Author {
    final String name;
    final int age;
    final int num_Of_Books;
    final String genre;
    Address address;
//Can't have constructor private for immutable class if there is no other constructor present
    public Author(String name, int age, int num_Of_Books, String genre, Address address) {
        this.name = name;
        this.age = age;
        this.num_Of_Books = num_Of_Books;
        this.genre = genre;
        //for mutable class we can pass this type
        //this.address = address;
        //for immutable class we have to pass this way
        this.address = new Address(address.getH_No(),address.getCity(),
                address.getState(),address.getCountry(),address.getZipCode());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getNum_Of_Books() {
        return num_Of_Books;
    }

    public String getGenre() {
        return genre;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Author: "+"\t"+getName()+"\t"+getAge()+"\t"+getGenre()+"\t"+getNum_Of_Books()+"\t"+
                getAddress();
    }
}
