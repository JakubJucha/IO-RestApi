package pl.lab.komputery;

import java.time.LocalDate;

public class Komputer {
    private Long identyfikator;
    private String nazwa;

    public void setIdentyfikator(Long identyfikator) {
        this.identyfikator = identyfikator;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setRokProdukcji(LocalDate rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    private LocalDate rokProdukcji;

    public Long getIdentyfikator() {
        return identyfikator;
    }

    public String getNazwa() {
        return nazwa;
    }

    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }

    public Komputer(Long identyfikator, String nazwa, LocalDate rokProdukcji) {
        this.identyfikator = identyfikator;
        this.nazwa = nazwa;
        this.rokProdukcji = rokProdukcji;
    }

    public Komputer() {
    }
}
