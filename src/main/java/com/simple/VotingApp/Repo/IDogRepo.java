package com.simple.VotingApp.Repo;

import com.simple.VotingApp.Entity.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDogRepo extends JpaRepository<Dog, Integer> {
}
