package dev.jiraya.marathon.ninjainpajamas.playground;

import dev.jiraya.marathon.ninjainpajamas.domain.Mission;

public class MissionPlayground {

    public static void main(String[] args) {

        Mission naruto = new Mission("Naruto");
        Mission sasuke = new Mission("Sasuke");

        naruto.completeMission();
        sasuke.completeMission();

        Mission.showStats();
    }
}
