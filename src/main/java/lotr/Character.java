package lotr;

import lombok.Getter;

@Getter
abstract public class Character {
    private int hp;
    private int power;

    public Character(int hp, int power) {
        this.hp = hp;
        this.power = power;
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }

    public void setPower(int power) {
        this.power = power;
    }

    public abstract void kick(Character c);

    public boolean isAlive() {
        return hp > 0;
    }

    public String toString() {

        return this.getClass().getSimpleName() +
                "{hp=" +
                this.hp +
                ", power=" +
                this.power +
                "}";
    }
}
