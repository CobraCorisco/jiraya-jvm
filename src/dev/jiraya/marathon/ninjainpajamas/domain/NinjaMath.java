package dev.jiraya.marathon.ninjainpajamas.domain;

public class NinjaMath {
    public void multiplyKunai(int kunais, int multiplier) {
        System.out.printf("Kunais: %d%n", kunais * multiplier);
    }

    public float divideLoot(int total, int ninjas) {
        if (ninjas == 0) return 0;
        return (float) total / ninjas;
    }

    public void addChakra(Ninja ninja, int chakra) {
        ninja.chakra += chakra;
    }

    public void averageChakra(int... chakras) {
        int sum = 0;
        int average;
        for (int chakra : chakras) {
            sum += chakra;
        }
        average = sum / chakras.length;
        System.out.println("Average chakra: " + average);
    }


}
