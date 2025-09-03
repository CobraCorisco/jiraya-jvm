package dev.jiraya.marathon.ninjainpajamas.domain;

import java.util.Arrays;

public class Exam {
    private String name;
    private Sensei sensei;
    private Ninja[] ninjas;
    private String address;

    public Exam(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sensei getSensei() {
        return sensei;
    }

    public void setSensei(Sensei sensei) {
        this.sensei = sensei;
    }

    public Ninja[] getNinjas() {
        return ninjas;
    }

    public void setNinjas(Ninja[] ninjas) {
        this.ninjas = ninjas;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Exam {" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sensei=" + (sensei != null ? sensei.name : "None") +
                ", ninjas=" + (ninjas != null ? Arrays.toString(
                Arrays.stream(ninjas).map(n -> n.name).toArray()
        ) : "None") +
                '}';
    }
}
