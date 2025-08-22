package dev.jiraya.marathon.exercises;

public class Exercise01 {

    public static void main(String[] args) {
        String name = "Agustin Muller";
        String address = "2101 Abbott Rd #7";
        float salary = 1514.00f;
        String date = "25/05/2025";

        System.out.println(
                "I, " + name +
                        ", living at " + address + ",\n" +
                        "confirm that I received the salary of " + salary +
                        ", on the date " + date + "."
        );
    }
}
