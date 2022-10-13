package lotr;

import kick.OrdinaryKick;

public class Elf extends Character {
    OrdinaryKick kick_strategy = new OrdinaryKick();
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character c){
        kick_strategy.kick(this, c);
//        if(getPower() > c.getPower()){
//            c.setHp(0);
//        }
//        else{
//            c.setPower(c.getPower()-1);
//        }
    }

    @Override
    public String toString() {
        return String.format("Elf{hp=%d, power=%d}", getHp(), getPower());
    }
}
