package lotr;

import java.util.Random;

public class Knight extends Noble{
    public Knight() {
        super(0, 0);
        setPower(getRandomGenerator().nextInt(2, 12));
        setHp(getRandomGenerator().nextInt(2, 12));
    }
}
