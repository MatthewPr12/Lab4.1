package lotr;

import java.util.Random;

public class King extends Character {
    public King(){
        super(new Random().nextInt(10) + 5, new Random().nextInt(10) + 5);
    }

    @Override
    public void kick(Character c){
        c.setHp(c.getHp() - new Random().nextInt(getPower()));
    }
    @Override
    public String toString() {
        return "King{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}
