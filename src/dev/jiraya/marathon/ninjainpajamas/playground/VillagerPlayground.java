package dev.jiraya.marathon.ninjainpajamas.playground;

import dev.jiraya.marathon.ninjainpajamas.domain.Villager;

public class VillagerPlayground {
    public static void main(String[] args) {
        Villager boruto = new Villager();
        boruto.setName("Boruto");
        boruto.setAge(10);
        boruto.show();
    }
}
