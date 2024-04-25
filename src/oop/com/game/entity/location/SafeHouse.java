package oop.com.game.entity.location;

import oop.com.game.entity.Player;

public class SafeHouse extends NormalLoc{
    public SafeHouse(Player p) {
        super(p);
    }

    @Override
    public boolean onLocation() {
        System.out.println("Güvenli evdesiniz !" +
                "\nCanınız yenilendi !");
        return true;
    }
}
