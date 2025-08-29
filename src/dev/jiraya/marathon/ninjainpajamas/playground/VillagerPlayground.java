package dev.jiraya.marathon.ninjainpajamas.playground;

import dev.jiraya.marathon.ninjainpajamas.domain.RANK;
import dev.jiraya.marathon.ninjainpajamas.domain.Villager;

public class VillagerPlayground {
    public static void main(String[] args) {
        Villager boruto = new Villager();
        boruto.setName("Boruto");
        boruto.setAge(12);
        boruto.show();

        Villager himawari = new Villager();
        himawari.init("Himawari", 9);
        himawari.init("Himawari", 9, RANK.Genin);
        himawari.show();
    }
}
