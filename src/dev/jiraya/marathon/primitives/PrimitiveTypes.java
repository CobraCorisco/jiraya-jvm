package dev.jiraya.marathon.primitives;

public class PrimitiveTypes {

    public static void main(String[] args) {
        byte numberOne = 1;
        int age = 26;
        long trillion = 1_000_000_000L;
        float gravity = 9.8f;
        double salary = 1514.00d;
        boolean isAlive = true;
        char letter = 'a';
        char heartSymbol = '\u2665';

        System.out.println("Number: " + numberOne);
        System.out.println("Age: " + age);
        System.out.println("Trillion: " + trillion);
        System.out.println("Gravity: " + gravity);
        System.out.println("Salary: " + salary);
        System.out.println("Is alive: " + isAlive);
        System.out.println("Letter: " + letter);
        System.out.println("Heart symbol (Unicode): " + heartSymbol);
    }
}
