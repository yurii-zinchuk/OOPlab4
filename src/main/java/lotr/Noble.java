package lotr;

import lombok.Getter;

import java.util.Random;

@Getter
public abstract class Noble extends Character{
    private Random randomGenerator = new Random();
    public Noble(int hp, int power) {
        super(hp, power);
    }

    @Override
    public void kick(Character c) {
        c.setHp(c.getHp()-randomGenerator.nextInt(0, getPower()));
    }
}
