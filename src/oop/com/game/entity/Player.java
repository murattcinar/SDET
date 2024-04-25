package oop.com.game.entity;

import oop.com.game.entity.gameChar.GameChar;
import oop.com.game.entity.gameChar.Archer;
import oop.com.game.entity.gameChar.Knight;
import oop.com.game.entity.gameChar.Samurai;
import oop.com.game.entity.location.Location;
import oop.com.game.entity.location.NormalLoc;
import oop.com.game.entity.location.SafeHouse;
import oop.com.game.entity.location.ToolStore;

import java.util.Scanner;

public class Player {
    private int id;
    private int damage;
    private int health;
    private double money;
    private String playerName;
    private String charName;
    private String locationName;

    private Scanner input = new Scanner(System.in);

    public Player() {
        this.playerName = playerName;
    }
    public void selectChar() {
        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("-----------------------------");
        for (GameChar gameChar : charList) {
            System.out.println("ID: " +gameChar.getId() +
                    "\t Karakter: " + gameChar.getName() +
                    "\t Hasar: " + gameChar.getDamage() +
                    "\t Sağlık: " + gameChar.getHealth() +
                    "\t Para: " + gameChar.getMoney());
        }
        System.out.print("-----------------------------" +
                "\nLütfen bir karakter seçiniz: ");

        byte selectChar = input.nextByte();
        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }
        System.out.println("Seçilen karakter: " + this.getCharName() +
                ", Hasar: " + this.getDamage() +
                ", Sağlık: " + this.getHealth() +
                ", Para: " + this.getMoney());
    }

    public void initPlayer(GameChar gameChar) {
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }


    public void selectLoc(){
        NormalLoc[] locList = {new SafeHouse(this,this.id,locationName), new ToolStore(this,this.id,locationName)};
        System.out.println("----------------------------------------" +
                "\nBölgeler");

        for (NormalLoc normalLoc : locList) {
            System.out.println("ID: " + normalLoc.getId() +
                    " " + normalLoc.getName());
        }
        System.out.print("Gitmek istediğiz bölgeyi seçiniz: ");

        byte selectLoc = input.nextByte();
        switch (selectLoc) {
            case 1:
                initLocation(new SafeHouse(this,this.id,locationName));
                break;
            case 2:
                initLocation(new ToolStore(this,this.id,locationName));
                break;
            default:
                initLocation(new SafeHouse(this,this.id,locationName));
        }

    }

    public void initLocation(NormalLoc normalLoc) {
        this.setId(normalLoc.getId());
        this.setLocationName(normalLoc.getName());
        normalLoc.onLocation();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
}
