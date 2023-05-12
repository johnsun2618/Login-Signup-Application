package com.example.GreenStitch_Assignment.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class CandidateDto {

    private int candidateId;

    private String candidateName;

    private String email;

    private String password;


    public CandidateDto() {
    }

    public CandidateDto(int candidateId, String candidateName, String email, String password) {
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
        return "CandidateDto{" +
                "candidateId=" + candidateId +
                ", candidateName='" + candidateName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
