package kick;

import lotr.Character;

import java.util.Random;

public class NobleKick implements BasicKick{
    @Override
    public void kick(Character c1, Character c2) {
        int how_strong = new Random().nextInt(c1.getPower());
        c2.setHp(c2.getHp() - how_strong);
        System.out.println("Power of the kick : " + how_strong);
    }
}
