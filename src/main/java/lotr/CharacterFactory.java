package lotr;

import java.util.Random;

public class CharacterFactory {
    Character createCharacter() {
        Random randomChooser = new Random();
        int toCreate = randomChooser.nextInt(1, 4);
        return switch (toCreate) {
            case 1 -> new Hobbit();
            case 2 -> new Elf();
            case 3 -> new King();
            case 4 -> new Knight();
            default -> null;
        };
    }
}
