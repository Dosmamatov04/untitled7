package com.company;

public class magicDoor {

    public static Hero[] Door(){

        Hero a = new Hero(300,40,80);
        Hero b = new Hero(315,41,85);
        Hero c = new Hero(320,42,82);
        Hero d = new Hero(310,43,88);

        Hero[] players = {a, b, c, d};
        return players;

    }

}