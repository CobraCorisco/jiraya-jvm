package dev.jiraya.marathon.arrays;

public class ForEachWeapon {
    public static void main(String[] args) {
        String[] weapons = new String[]{"Shuriken", "Katana", "Nunchaku",
                "Kunai", "Bo Staff"};

        int[] damagePoints = {50, 90, 70, 60, 80};

        System.out.println("Ninja Weapons List:");

        int index = 0;
        for (String weapon : weapons) {
            System.out.printf("Weapon: %-10s | Damage: %d%n", weapon, damagePoints[index]);
            index++;
        }
    }
}
