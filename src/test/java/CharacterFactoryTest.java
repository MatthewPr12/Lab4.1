import lotr.*;
import lotr.Character;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CharacterFactoryTest {
    private Character c1;

    @BeforeEach
    void randomCharacter(){
        int whichCharacter = new Random().nextInt(CharacterFactory.characterCount);
        c1 = CharacterFactory.createCharacter(whichCharacter);
    }

    @Test
    void testIsCharacter() {
        assertTrue(c1 instanceof Hobbit || c1 instanceof Elf ||
                c1 instanceof Knight || c1 instanceof King);
    }

}