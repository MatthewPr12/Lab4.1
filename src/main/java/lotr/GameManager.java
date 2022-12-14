package lotr;

import java.util.Random;

public class GameManager {

    public static void fight(Character c1, Character c2){
        System.out.println("Lets get ready to rumble...");
        System.out.println("Character1 : ");
        System.out.println(c1.toString());
        System.out.println("Character2 : ");
        System.out.println(c2.toString());
        if(c1 instanceof Hobbit && c2 instanceof Hobbit){
            System.out.println("Humanity's not ready for the battle between two Hobbits");
            return;
        } else if (c1 instanceof Elf && c2 instanceof Elf) {
            System.out.println("The Elf met his friend other Elf. Obviously they won't fight each other;)))");
            System.out.println("Friendship is a true miracle");
            return;
        }
        int counter=0;
        while(c1.isAlive() && c2.isAlive()){
            counter++;
            System.out.println("-------------------------");
            System.out.println("Round " + counter);
            System.out.println("Outstanding move from " + c1.getClass().getSimpleName());
            c1.kick(c2);
            System.out.println(c2);
            if(!c2.isAlive()){
                System.out.println("Game's over for " + c2.getClass().getSimpleName());
                break;
            }
            System.out.println("*******");
            System.out.println("Powerful response from " + c2.getClass().getSimpleName());
            c2.kick(c1);
            System.out.println(c1);
            if(!c1.isAlive()){
                System.out.println(c2.getClass().getSimpleName() + " is a winner today");
                break;
            }
        }
    }
    public static void main(String[] args) {
        Character c1 = CharacterFactory.createCharacter(new Random().nextInt(CharacterFactory.characterCount));
        Character c2 = CharacterFactory.createCharacter(new Random().nextInt(CharacterFactory.characterCount));
        fight(c1, c2);
    }
}

