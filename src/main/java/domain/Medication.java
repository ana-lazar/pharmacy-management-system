package domain;

import java.time.LocalDate;

public class Medication extends Entity<Integer> {
    private String name;
    private LocalDate expirationDate;

    public Medication() {
    }

    public Medication(String name, LocalDate expirationDate) {
        this.name = name;
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}
