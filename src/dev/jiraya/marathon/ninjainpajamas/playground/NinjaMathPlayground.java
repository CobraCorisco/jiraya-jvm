package dev.jiraya.marathon.ninjainpajamas.playground;

import dev.jiraya.marathon.ninjainpajamas.domain.Ninja;
import dev.jiraya.marathon.ninjainpajamas.domain.NinjaMath;
import dev.jiraya.marathon.ninjainpajamas.domain.RANK;

public class NinjaMathPlayground {
    public static void main(String[] args) {
        NinjaMath ninjaCalculator = new NinjaMath();

        ninjaCalculator.multiplyKunai(10, 4);

        int loot = (int) ninjaCalculator.divideLoot(420, 7);
        System.out.printf("Loot: %d%n", loot);

        Ninja naruto = new Ninja();
        naruto.name = "Naruto";
        naruto.age = 12;
        naruto.chakra = 420;
        naruto.rank = RANK.Genin;

        ninjaCalculator.addChakra(naruto, 100);
        System.out.printf("%s's Chakra: %d%n", naruto.name, naruto.chakra);

        ninjaCalculator.averageChakra(120, 230, 110);
    }
}
