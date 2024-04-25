package oop.com.game.entity.location;

import oop.com.game.entity.Player;

public class SafeHouse extends NormalLoc{
    public SafeHouse(Player p,int id, String name) {
        super(p, 1, "Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Güvenli evdesiniz !" +
                "\nCanınız yenilendi !");
        return true;
    }
}
