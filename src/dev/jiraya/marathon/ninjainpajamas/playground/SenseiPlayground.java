package dev.jiraya.marathon.ninjainpajamas.playground;

import dev.jiraya.marathon.ninjainpajamas.domain.Ninja;
import dev.jiraya.marathon.ninjainpajamas.domain.RANK;

public class SenseiPlayground {
    public static void main(String[] args) {
        Ninja kakashi = new Ninja();
        kakashi.name = "Kakashi Hatake";
        kakashi.age = 31;
        kakashi.rank = RANK.Jonin;

        System.out.printf(
                "Sensei: %s | age: %d | rank: %s\n", kakashi.name, kakashi.age, kakashi.rank
        );
    }
}
