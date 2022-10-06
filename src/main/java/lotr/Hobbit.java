package lotr;

public class Hobbit extends Character{
    public Hobbit() {
        super(3, 0);
    }

    private void toCry() {
        System.out.println("crying...");
    }

    @Override
    public void kick(Character c) {
        toCry();
    }
}
