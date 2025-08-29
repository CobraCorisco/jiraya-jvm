package dev.jiraya.marathon.ninjainpajamas.playground;

import dev.jiraya.marathon.ninjainpajamas.domain.Ninja;
import dev.jiraya.marathon.ninjainpajamas.domain.RANK;

public class NinjaPlayground {
    public static void main(String[] args) {
        Ninja naruto = new Ninja();
        naruto.name = "Naruto";
        naruto.age = 12;
        naruto.chakra = 120;
        naruto.rank = RANK.Genin;

        naruto.status();
    }
}
