package dev.jiraya.marathon.ninjainpajamas.domain;

import java.util.Arrays;

public class Sensei {
    public String name;
    public int age;
    public int chakra;
    public RANK rank;
    public Exam[] exams;

    public Sensei(String name, int age, int chakra, RANK rank) {
        this.name = name;
        this.age = age;
        this.chakra = chakra;
        this.rank = rank;
    }

    public void setExams(Exam[] exams) {
        this.exams = exams;
    }

    @Override
    public String toString() {
        return "Sensei {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", chakra=" + chakra +
                ", rank=" + rank +
                ", exams=" + (exams != null ? Arrays.toString(exams) : "[]") +
                '}';
    }
}
