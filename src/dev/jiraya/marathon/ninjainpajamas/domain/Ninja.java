package dev.jiraya.marathon.ninjainpajamas.domain;

public class Ninja {
    public String name;
    public int age;
    public int chakra;
    public RANK rank;

    public void status() {
        System.out.printf("Name: %s | age: %d | chakra: %d | rank: %s\n",
                this.name, this.age, this.chakra, this.rank);
    }
}
