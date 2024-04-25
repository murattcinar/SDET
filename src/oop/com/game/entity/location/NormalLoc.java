package oop.com.game.entity.location;

import oop.com.game.entity.Player;

public abstract class NormalLoc extends Location{

    public NormalLoc(Player p) {
        super(p);
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}
