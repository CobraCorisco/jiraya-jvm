package dev.jiraya.marathon.ninjainpajamas.playground;

import dev.jiraya.marathon.ninjainpajamas.domain.Clan;

import java.util.Arrays;

public class ClanPlayground {

    public static void main(String[] args) {

        Clan uchiha = new Clan(
                "Uchiha",
                "Hidden Leaf",
                "Sharingan",
                new String[]{"Itachi", "Sasuke"}
        );

        System.out.println("Clan{" +
                "name='" + uchiha.name + '\'' +
                ", village='" + uchiha.village + '\'' +
                ", kekkeiGenkai='" + uchiha.kekkeiGenkai + '\'' +
                ", foundedYear=" + uchiha.foundedYear +
                ", members=" + Arrays.toString(uchiha.members) +
                '}');

        Clan hyuga = new Clan(
                "Hyuga",
                "Hidden Leaf",
                "Byakugan",
                new String[]{"Hinata", "Neji", "Hanabi"},
                167
        );

        System.out.println("Clan{" +
                "name='" + hyuga.name + '\'' +
                ", village='" + hyuga.village + '\'' +
                ", kekkeiGenkai='" + hyuga.kekkeiGenkai + '\'' +
                ", foundedYear=" + hyuga.foundedYear +
                ", members=" + Arrays.toString(hyuga.members) +
                '}');
    }
}
