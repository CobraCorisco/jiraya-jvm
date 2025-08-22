package dev.jiraya.marathon.exercises;

public class Exercise05 {

    public static void main(String[] args) {
        // Given the price of a car, find out in how many installments it can be divided
        // Condition: installmentValue >= 1000

        float carPrice = 48_642.00f;
        int installments = 1;
        float installmentValue;

        System.out.printf("The car price is $%.2f. Possible installments are:%n", carPrice);
        while (true) {
            installmentValue = carPrice / installments;
            if (installmentValue < 1000) break;
            System.out.printf("Installments: %d | Value: $%.2f%n", installments, installmentValue);
            installments++;
        }
    }
}
