package lotr;

import java.util.Random;

public class Knight extends Noble{
    public Knight(){
        super( 2, 12);
    }

    @Override
    public void kick(Character c){
        c.setHp(c.getHp() - new Random().nextInt(getPower()));
    }

    @Override
    public String toString() {
        return "Knight{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}
