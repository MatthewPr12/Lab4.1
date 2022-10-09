package lotr;

import java.util.Random;

public class CharacterFactory {
    public static Character createCharacter(){
        lotr.Character[] characters = {new Hobbit(), new King(), new Knight()};
        return characters[new Random().nextInt(characters.length)];
    }
}
