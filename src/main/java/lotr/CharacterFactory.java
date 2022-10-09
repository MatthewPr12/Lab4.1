package lotr;

public class CharacterFactory {
    public static int characterCount=4;
    public static Character createCharacter(int channel){
        switch (channel){
            case 0:
                return new Hobbit();
            case 1:
                return new King();
            case 2:
                return new Knight();
            case 3:
                return new Elf();
            default:
                throw new IllegalArgumentException("Character creation failure");
        }
    }
}
