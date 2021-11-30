package com.coll.set.hashset;

public class Books {
    private int book_id;
    private String book_Name;
    private String book_Author;
    private double book_Price;

    public Books(int book_id, String book_Name, String book_Author, double book_Price) {
        this.book_id = book_id;
        this.book_Name = book_Name;
        this.book_Author = book_Author;
        this.book_Price = book_Price;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
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

    public double getBook_Price() {
        return book_Price;
    }

    public void setBook_Price(double book_Price) {
        this.book_Price = book_Price;
    }

    @Override
    public String toString() {
        return "Books{" +
                "book_id=" + book_id +
                ", book_Name='" + book_Name + '\'' +
                ", book_Author='" + book_Author + '\'' +
                ", book_Price=" + book_Price +
                '}';
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        Books book=(Books) obj;
        boolean flag=false;
        if((this.book_id==book.book_id)&&(this.book_Name.equals(book.book_Name))
                &&(this.book_Author.equals(book.book_Author))&&
                (this.book_Price==book.book_Price)){
            flag=true;
        }
        return flag;
    }
}
