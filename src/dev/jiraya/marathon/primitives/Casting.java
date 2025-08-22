package dev.jiraya.marathon.primitives;

public class Casting {

    public static void main(String[] args) {
        // Widening casting (implicit)
        byte byteValue = 10;
        int intValue = byteValue;         // byte -> int
        double doubleValue = intValue;    // int -> double

        System.out.println("Widening casting:");
        System.out.println("byteValue: " + byteValue);
        System.out.println("intValue: " + intValue);
        System.out.println("doubleValue: " + doubleValue);

        // Narrowing casting (explicit)
        double doubleNum = 9.78;
        int intNum = (int) doubleNum;    // double -> int (fraction lost)
        byte byteNum = (byte) intNum;    // int -> byte

        System.out.println("\nNarrowing casting:");
        System.out.println("doubleNum: " + doubleNum);
        System.out.println("intNum (casted): " + intNum);
        System.out.println("byteNum (casted): " + byteNum);

        // Casting between char and int
        char letter = 'A';
        int letterCode = (int) letter;  // char -> int (ASCII/Unicode value)
        char newLetter = (char) (letterCode + 1); // int -> char

        System.out.println("\nChar and int casting:");
        System.out.println("letter: " + letter);
        System.out.println("letterCode: " + letterCode);
        System.out.println("newLetter: " + newLetter);
    }
}
