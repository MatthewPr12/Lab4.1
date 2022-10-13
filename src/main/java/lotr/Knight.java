package lotr;

import kick.NobleKick;

import java.util.Random;

public class Knight extends Noble{
    NobleKick kick_strategy = new NobleKick();
    public Knight(){
        super( 2, 12);
    }

//    @Override
//    public void kick(Character c){
//        kick_strategy.kick(this, c);
////        c.setHp(c.getHp() - new Random().nextInt(getPower()));
//    }

    @Override
    public String toString() {
        return "Knight{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}
