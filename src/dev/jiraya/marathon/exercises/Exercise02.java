package dev.jiraya.marathon.exercises;

public class Exercise02 {

    public static void main(String[] args) {

        System.out.println("I want to know how much I have to pay in taxes in the Netherlands (2020) based on my annual salary.\n");

        String name = "Agustin Muller";
        float monthlySalary = 1514.00f;
        float annualSalary = monthlySalary * 12;
        float tax;
        boolean isAnnualSalaryGreaterThanZero = annualSalary > 0;

        if (annualSalary >= 68_507f) {
            tax = annualSalary * 0.4950f;
        } else if (annualSalary >= 34_712f) {
            tax = annualSalary * 0.3735f;
        } else if (isAnnualSalaryGreaterThanZero) {
            tax = annualSalary * 0.0970f;
        } else {
            tax = 0.0f;
        }

        System.out.println(String.format(
                "Hello, my name is %s.\n" +
                        "My monthly salary is $%.2f.\n" +
                        "My annual salary is $%.2f.\n" +
                        "The tax I have to pay this year is $%.2f.",
                name, monthlySalary, annualSalary, tax
        ));
    }
}
