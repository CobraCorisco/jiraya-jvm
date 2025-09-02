package dev.jiraya.marathon.ninjainpajamas.domain;

public class Clan {

    public String name;
    public String village;
    public String kekkeiGenkai;
    public String[] members;
    public int foundedYear;

    {
        System.out.println("A new Clan is being formed in the ninja world!");
        foundedYear = 0;
    }

    public Clan(String name, String village, String kekkeiGenkai, String[] members) {
        this.name = name;
        this.village = village;
        this.kekkeiGenkai = kekkeiGenkai;
        this.members = members;
    }

    public Clan(String name, String village, String kekkeiGenkai, String[] members, int foundedYear) {
        this(name, village, kekkeiGenkai, members);
        this.foundedYear = foundedYear;
    }
}
