package com.example.GreenStitch_Assignment.Entity;

import jakarta.persistence.*;

@Entity
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //AUTO because I want "id" should be created automatically
    @Column(name = "candidate_id")
    private int candidateId;

    @Column(name = "candidate_name")
    private String candidateName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    public Candidate() {}

    public Candidate(int candidateId, String candidateName, String email, String password) {
        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.email = email;
        this.password = password;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "candidateId=" + candidateId +
                ", candidateName='" + candidateName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}
