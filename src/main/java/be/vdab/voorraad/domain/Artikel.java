package be.vdab.voorraad.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "artikels")
public class Artikel {
    @Id
    private long id;
    private int voorraad;

    public Artikel(long id) {
        this.id = id;
    }

    protected Artikel() {
    }

    public long getId() {
        return id;
    }

    public int getVoorraad() {
        return voorraad;
    }
}
