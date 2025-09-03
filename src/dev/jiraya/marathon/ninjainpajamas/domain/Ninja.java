package dev.jiraya.marathon.ninjainpajamas.domain;

public class Ninja {
    public String name;
    public int age;
    public int chakra;
    public RANK rank;
    public Exam exam;

    public Ninja(String name, int age, int chakra, RANK rank) {
        this.name = name;
        this.age = age;
        this.chakra = chakra;
        this.rank = rank;
    }

    public Ninja() {

    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public void status() {
        System.out.printf("Name: %s | age: %d | chakra: %d | rank: %s\n",
                this.name, this.age, this.chakra, this.rank);
    }

    @Override
    public String toString() {
        return "Ninja {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", chakra=" + chakra +
                ", rank=" + rank +
                ", exam=" + (exam != null ? exam.getName() : "None") +
                '}';
    }
}
