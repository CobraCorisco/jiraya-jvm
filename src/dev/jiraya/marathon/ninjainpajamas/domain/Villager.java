package dev.jiraya.marathon.ninjainpajamas.domain;

public class Villager {
    private String name;
    private int age;
    private RANK rank;

    public void init(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void init(String name, int age, RANK rank) {
        this.init(name, age);
        this.rank = rank;
    }

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

    public RANK getRank() {
        return rank;
    }

    public void setRank(RANK rank) {
        this.rank = rank;
    }

    public void show() {
        if (this.rank != null) {
            System.out.printf("Name: %s | age: %d | rank: %s\n", this.name, this.age, this.rank);
            return;
        }
        System.out.printf("Name: %s | age: %d\n", this.name, this.age);
    }
}
