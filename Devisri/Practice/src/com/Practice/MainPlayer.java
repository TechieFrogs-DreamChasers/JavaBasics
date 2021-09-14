package com.Practice;

import com.Practice.Encapsulation.Player;

public class MainPlayer {
    public static void main(String[] args) {
        /*If Every data value in Player class is public
        We can change values and everything from here itself
        Player player=new Player();
        player.id=235896;
        player.name="Boomer";
        player.level=5;
        player.rank=10;
        player.item="Shoe";
        System.out.println(player.id+"  "+player.name+"  "+player.level+"  "+ player.rank+"  "+player.item);
        player.hisLevel();
        int lost=20
        player.loseRank(lost);*/
        Player player = new Player();
        Player.setGame_version("Version 1.2.5");
        player.setId(25689);
        player.setName("Boomer");
        player.setLevel(10);
        player.setRank(2);
        player.setItem("Wings");
        System.out.println(player.getGame_Name() + " || " + Player.getGame_version() + " || " + player.getId() +
                " || " + player.getName() + " || "
                + player.getLevel() + " || " + player.getRank() + " || " + player.getItem());
    }
}
