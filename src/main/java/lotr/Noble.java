package lotr;

import kick.NobleKick;

import java.util.Random;

public abstract class Noble extends Character{
    NobleKick kick_strategy = new NobleKick();
    private static final Random randomGenerator = new Random();
    public Noble(int min, int max){
        super( randomGenerator.nextInt(max-min) + min,randomGenerator.nextInt(max-min) + min);
    }

    @Override
    public void kick(Character c){
        kick_strategy.kick(this, c);
    }
}
