package dev.jiraya.marathon.arrays;

public class NinjaBackpack {
    public static void main(String[] args) {
        String[] ninjaNames = {"Rocky", "Colt", "Tum-Tum"};

        String[][] ninjaBackpacks = {
                {"Shuriken", "Smoke Bomb", "Kunai"},
                {"Katana", "Rope", "Health Potion"},
                {"Nunchaku", "Throwing Stars", "Map"}
        };

        for (int ninja = 0; ninja < ninjaBackpacks.length; ninja++) {
            System.out.printf("Ninja: %s%n", ninjaNames[ninja]);
            System.out.println("\t - Backpacks' Items:");
            for (int item = 0; item < ninjaBackpacks[ninja].length; item++) {
                System.out.printf("\t\t- %s%n", ninjaBackpacks[ninja][item]);
            }
            System.out.println();
        }
    }
}
