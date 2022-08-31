package domain;

public class Practitioner extends User {
    private String name;

    public Practitioner() {
    }

    public Practitioner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
