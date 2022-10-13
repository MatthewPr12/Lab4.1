package lotr;

public class King extends Noble {
    public King() {
        super(5, 15);
    }

    @Override
    public String toString() {
        return "King{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}
