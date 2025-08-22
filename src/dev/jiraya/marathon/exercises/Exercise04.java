package dev.jiraya.marathon.exercises;

public class Exercise04 {

    public static void main(String[] args) {
        System.out.println("Print even numbers from 1 to 1000");

        for (int i = 0; i <= 1000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
