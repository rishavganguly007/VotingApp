package com.simple.VotingApp.Repo;

import com.simple.VotingApp.Entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICatRepo extends JpaRepository<Cat, Integer> {
}
