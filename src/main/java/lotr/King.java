package lotr;

import java.util.Random;

public class King extends Noble{
    public King() {

        super(0, 0);
        setPower(getRandomGenerator().nextInt(5, 15));
        setHp(getRandomGenerator().nextInt(5, 15));
    }
}
