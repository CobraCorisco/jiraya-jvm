package dev.jiraya.marathon.ninjainpajamas.domain;

public class Mission {

    String ninjaName;
    private static int totalNinjas;
    private static int totalMissionsCompleted;

    static {
        System.out.println("Mission class loaded! Ninja world ready for action.");
        totalNinjas = 0;
        totalMissionsCompleted = 0;
    }

    public Mission(String ninjaName) {
        this.ninjaName = ninjaName;
        totalNinjas++;
    }

    public void completeMission() {
        totalMissionsCompleted++;
        System.out.println(ninjaName + " completed a mission!");
    }

    public static void showStats() {
        System.out.println("Total ninjas: " + totalNinjas);
        System.out.println("Total missions completed: " + totalMissionsCompleted);
    }
}
