package dev.jiraya.marathon.ninjainpajamas.domain;

public class Villager {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age");
            return;
        }
        this.age = age;
    }

    public void show() {
        System.out.printf("Name: %s | age: %d\n", this.name, this.age);
    }
}
