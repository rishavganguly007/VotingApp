package com.simple.VotingApp.Entity;
import javax.persistence.*;
import java.util.Objects;

@Entity
public class Dog {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
    )
    Integer id;
    @Column
    Integer DogVotes;

    public Dog(){}
    public Dog(Integer id, Integer DogVotes) {
        this.id = id;
        DogVotes = DogVotes;
    }

    public Dog(Integer dogVotes) {
        DogVotes = dogVotes;
    }

    public Integer getId() {
        return id;
    }

    public Integer getDogVotes() {
        return DogVotes;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDogVotes(Integer dogVotes) {
        DogVotes = dogVotes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(id, dog.id) && Objects.equals(DogVotes, dog.DogVotes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, DogVotes);
    }
}
