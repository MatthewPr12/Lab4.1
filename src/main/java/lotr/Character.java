package lotr;

//import lombok.Getter;

public class Character {
    private int hp;
    private int power;

    public Character(int hp, int power){
        setHp(hp);
        this.power = power;
    }
    public void setHp(int hp){
        if(hp<0){
            hp=0;
        }
        this.hp = hp;
    }

    public void setPower(int pw){
        if(pw<0)pw=0;
        this.power=pw;
    }
    public void kick(Character c){
        setHp(getHp()-c.getPower());
    }

    public boolean isAlive(){
        return getHp()>0;
    }


    @Override
    public String toString() {
        return "Character{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }
}
