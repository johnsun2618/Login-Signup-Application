package com.example.GreenStitch_Assignment.Repository;

import com.example.GreenStitch_Assignment.Entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface CandidateRepository extends JpaRepository<Candidate, Integer> {


    Optional<Candidate> findOneByEmailAndPassword(String email, String password);

    Candidate findByEmail(String email);

}
