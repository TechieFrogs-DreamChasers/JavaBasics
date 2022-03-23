package com.newPractice.java8.mr;

public class Book {
    private Long book_Id;
    private String book_ISBN;
    private String book_Name;
    private String book_Author;

    public Book(String book_Name, String book_Author) {
        this.book_Name = book_Name;
        this.book_Author = book_Author;
    }

    public Book(Long book_Id, String book_ISBN, String book_Name, String book_Author) {
        this.book_Id = book_Id;
        this.book_ISBN = book_ISBN;
        this.book_Name = book_Name;
        this.book_Author = book_Author;
    }

    public Long getBook_Id() {
        return book_Id;
    }

    public void setBook_Id(Long book_Id) {
        this.book_Id = book_Id;
    }

    public String getBook_ISBN() {
        return book_ISBN;
    }

    public void setBook_ISBN(String book_ISBN) {
        this.book_ISBN = book_ISBN;
    }

    public String getBook_Name() {
        return book_Name;
    }

    public void setBook_Name(String book_Name) {
        this.book_Name = book_Name;
    }

    public String getBook_Author() {
        return book_Author;
    }

    public void setBook_Author(String book_Author) {
        this.book_Author = book_Author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_Name='" + book_Name + '\'' +
                ", book_Author='" + book_Author + '\'' +
                '}';
    }
}
