package com.simple.VotingApp.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Cat {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
    )
    Integer id;
    @Column
    Integer CatVotes;

    public Cat(){}
    public Cat(Integer id, Integer CatVotes) {
        this.id = id;
        CatVotes = CatVotes;
    }

    public Cat(Integer catVotes) {
        CatVotes = catVotes;
    }

    public Integer getId() {
        return id;
    }

    public Integer getCatVotes() {
        return CatVotes;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCatVotes(Integer CatVotes) {
        CatVotes = CatVotes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(id, cat.id) && Objects.equals(CatVotes, cat.CatVotes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, CatVotes);
    }
}
