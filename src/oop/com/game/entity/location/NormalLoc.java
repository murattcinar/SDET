package oop.com.game.entity.location;

import oop.com.game.entity.Player;

public abstract class NormalLoc extends Location{

    public NormalLoc(Player p,int id, String name) {
        super(p,id,name);
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}
