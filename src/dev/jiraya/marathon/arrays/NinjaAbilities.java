package dev.jiraya.marathon.arrays;

public class NinjaAbilities {
    public static void main(String[] args) {
        String[] ninjaNames = {"Naruto", "Sasuke", "Sakura"};

        String[][] ninjaAbilities = {
                {"Shadow Clone Jutsu", "Rasengan", "Sage Mode"},
                {"Sharingan", "Chidori", "Fire Style: Fireball Jutsu"},
                {"Medical Ninjutsu", "Chakra Enhanced Strength", "Genjutsu Release"}
        };

        int ninjaIndex = 0;
        for (String[] abilities : ninjaAbilities) {
            System.out.printf("Ninja: %s%n", ninjaNames[ninjaIndex]);
            System.out.println("\t- Abilities:");
            for (String ability : abilities) {
                System.out.printf("\t\t- %s%n", ability);
            }
            ninjaIndex++;
        }
    }
}
