package lotr;

import lombok.Getter;

@Getter
public class Hobbit extends lotr.Character {

    public Hobbit(){
        super(3, 0);
    }

    @Override
    public void kick(Character c){
        super.kick(c);
        System.out.println("\uD83D\uDE22\uD83D\uDE22");
    }

    @Override
    public String toString() {
        return String.format("Hobbit{hp=%d, power=%d}", getHp(), getPower());
    }
}
