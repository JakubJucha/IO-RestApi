package pl.zajecia.komputery.dao.Entities;

import com.sun.javafx.beans.IDProperty;
import com.sun.javafx.geom.transform.Identity;
import org.springframework.boot.autoconfigure.domain.EntityScan;
//import persistence.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Komputer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
