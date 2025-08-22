package dev.jiraya.marathon.exercises;

public class Exercise03 {

    public static void main(String[] args) {
        int today = 1;

        switch (today) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Weekday");
                break;
            default:
                System.out.println("Weekend");
        }
    }
}
