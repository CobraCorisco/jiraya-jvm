package dev.jiraya.marathon.arrays;

public class NinjaArrays {
    public static void main(String[] args) {
        // Default values of array initialization:
        // byte, short, int, long, float, double -> 0 or 0.0
        // char -> '\u0000'
        // String -> null

        String[] ninjaNames = new String[3];

        int[] ninjaAges = null;
        ninjaAges = new int[3];

        ninjaNames[0] = "Rocky";
        ninjaNames[1] = "Colt";
        ninjaNames[2] = "Tum-Tum";

        ninjaAges[0] = 12;
        ninjaAges[1] = 10;
        ninjaAges[2] = 9;

        System.out.println("3 Ninjas:");
        for (int i = 0; i < ninjaNames.length; i++) {
            System.out.printf("Ninja: %s | Age: %d%n", ninjaNames[i], ninjaAges[i]);
        }
    }
}
