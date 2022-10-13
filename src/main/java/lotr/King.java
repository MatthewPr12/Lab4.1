package lotr;
import kick.NobleKick;

import java.util.Random;

public class King extends Noble {
    NobleKick kick_strategy = new NobleKick();
    public King(){
        super(5, 15);
    }

//    @Override
//    public void kick(Character c){
//        kick_strategy.kick(this, c);
////        c.setHp(c.getHp() - new Random().nextInt(getPower()));
//    }
    @Override
    public String toString() {
        return "King{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}
