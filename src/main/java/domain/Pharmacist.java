package domain;

public class Pharmacist extends User {
    private String name;

    public Pharmacist() {
    }

    public Pharmacist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
