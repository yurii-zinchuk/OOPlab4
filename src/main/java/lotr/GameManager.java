package lotr;

public class GameManager {
    public void fight (Character c1, Character c2) {
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println(c1.getClass().getSimpleName() + " kicks " + c2.getClass().getSimpleName());
            c1.kick(c2);
            System.out.println(c2.getClass().getSimpleName() + " kicks " + c1.getClass().getSimpleName());
            c2.kick(c1);
        }
    }
}
