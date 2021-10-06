package com.Practice.Encapsulation;

public class Player {
    private final String game_Name = "Run & Fly";
    private static String game_version;
    private String name;
    public int id;
    private int level;
    public int rank;
    private String item;

    public static void main(String[] args) {

    }

    public String getGame_Name() {
        return game_Name;
    }

    public static String getGame_version() {
        return game_version;
    }

    public static void setGame_version(String game_version) {
        Player.game_version = game_version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
   /*public void loseRank(int lost){
        this.rank=this.rank-lost;
        if(this.rank<=0){
            System.out.println("The player lost "+lost+" times, and his rank stays bottom!!!");
        }
    }
    public int hisLevel(){
        return this.level;
    }*/
}
