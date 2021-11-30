package com.coll.set.tree;

public class Movies implements Comparable<Movies>{
    private int movie_Id;
    private String movie_Name;
    private int movie_Release_Year;
    private String movie_Genre;

    public Movies(int movie_Id, String movie_Name, int movie_Release_Year, String movie_Genre) {
        this.movie_Id = movie_Id;
        this.movie_Name = movie_Name;
        this.movie_Release_Year = movie_Release_Year;
        this.movie_Genre = movie_Genre;
    }

    public int getMovie_Id() {
        return movie_Id;
    }

    public void setMovie_Id(int movie_Id) {
        this.movie_Id = movie_Id;
    }

    public String getMovie_Name() {
        return movie_Name;
    }

    public void setMovie_Name(String movie_Name) {
        this.movie_Name = movie_Name;
    }

    public int getMovie_Release_Year() {
        return movie_Release_Year;
    }

    public void setMovie_Release_Year(int movie_Release_Year) {
        this.movie_Release_Year = movie_Release_Year;
    }

    public String getMovie_Genre() {
        return movie_Genre;
    }

    public void setMovie_Genre(String movie_Genre) {
        this.movie_Genre = movie_Genre;
    }

    @Override
    public String toString() {
        return getMovie_Id()+"\t"+getMovie_Name()+"\t"+getMovie_Release_Year()+"\t"+getMovie_Genre();
    }

    @Override
    public int compareTo(Movies o) {
        if(this.getMovie_Release_Year() > o.getMovie_Release_Year())
            return 1;
        else if(this.getMovie_Release_Year() < o.getMovie_Release_Year())
            return -1;
        else
            return 0;
    }
}
