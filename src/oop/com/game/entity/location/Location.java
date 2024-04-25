package oop.com.game.entity.location;

import oop.com.game.entity.Player;

public abstract class Location {
    private int id;
    private Player player;
    private String name;

    public Location(Player player,int id, String name) {
        this.player = player;
        this.id = id;
        this.name = name;
    }

    public abstract boolean onLocation();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
