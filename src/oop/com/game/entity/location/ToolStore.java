package oop.com.game.entity.location;

import oop.com.game.entity.Player;

public class ToolStore extends NormalLoc {
    public ToolStore(Player p,int id, String name) {
        super(p,2, "Tool Store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Mağazaya Hoşgeldiniz...");
        return true;
    }
}
