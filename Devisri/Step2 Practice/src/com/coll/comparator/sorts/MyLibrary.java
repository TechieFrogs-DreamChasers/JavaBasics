package com.coll.comparator.sorts;

public class MyLibrary {
    private int book_Id;
    private String book_Name;
    private String book_author_Name;
    private String book_genre;
    private int book_release_Year;

    public MyLibrary(int book_Id, String book_Name, String book_author_Name, String book_genre, int book_release_Year) {
        this.book_Id = book_Id;
        this.book_Name = book_Name;
        this.book_author_Name = book_author_Name;
        this.book_genre = book_genre;
        this.book_release_Year = book_release_Year;
    }

    public int getBook_Id() {
        return book_Id;
    }

    public void setBook_Id(int book_Id) {
        this.book_Id = book_Id;
    }

    public String getBook_Name() {
        return book_Name;
    }

    public void setBook_Name(String book_Name) {
        this.book_Name = book_Name;
    }

    public String getBook_author_Name() {
        return book_author_Name;
    }

    public void setBook_author_Name(String book_author_Name) {
        this.book_author_Name = book_author_Name;
    }

    public String getBook_genre() {
        return book_genre;
    }

    public void setBook_genre(String book_genre) {
        this.book_genre = book_genre;
    }

    public int getBook_release_Year() {
        return book_release_Year;
    }

    public void setBook_release_Year(int book_release_Year) {
        this.book_release_Year = book_release_Year;
    }

    @Override
    public String toString() {
        return "Book Details: "+"\t"+getBook_Id()+"\t"+getBook_Name()+"\t"+getBook_author_Name()+
                "\t"+getBook_genre()+"\t"+getBook_release_Year()+"\n";
    }
}
