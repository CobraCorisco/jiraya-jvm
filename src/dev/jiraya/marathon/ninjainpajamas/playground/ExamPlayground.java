package dev.jiraya.marathon.ninjainpajamas.playground;

import dev.jiraya.marathon.ninjainpajamas.domain.Exam;
import dev.jiraya.marathon.ninjainpajamas.domain.Ninja;
import dev.jiraya.marathon.ninjainpajamas.domain.RANK;
import dev.jiraya.marathon.ninjainpajamas.domain.Sensei;

public class ExamPlayground {
    public static void main(String[] args) {
        Exam chuninExam = new Exam("Chunin Exams", "Leaf Village");

        Sensei kakashi = new Sensei("Kakashi", 26, 300, RANK.Jonin);

        Ninja naruto = new Ninja("Naruto", 12, 120, RANK.Genin);
        Ninja sasuke = new Ninja("Sasuke", 12, 110, RANK.Genin);
        Ninja sakura = new Ninja("Sakura", 12, 95, RANK.Genin);

        chuninExam.setSensei(kakashi);

        Ninja[] ninjas = {naruto, sasuke, sakura};
        chuninExam.setNinjas(ninjas);

        kakashi.setExams(new Exam[]{chuninExam});

        naruto.setExam(chuninExam);
        sasuke.setExam(chuninExam);
        sakura.setExam(chuninExam);

        System.out.println("Exam Details:");
        System.out.println(chuninExam);

        System.out.println("\nSensei Details:");
        System.out.println(kakashi);

        System.out.println("\nNinjas Participating:");
        for (Ninja ninja : ninjas) {
            System.out.println(ninja);
        }
    }
}
