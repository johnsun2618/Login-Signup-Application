package com.example.GreenStitch_Assignment.Service.Implimentation;

import com.example.GreenStitch_Assignment.DTO.CandidateDto;
import com.example.GreenStitch_Assignment.DTO.LoginDto;
import com.example.GreenStitch_Assignment.Entity.Candidate;
import com.example.GreenStitch_Assignment.Repository.CandidateRepository;
import com.example.GreenStitch_Assignment.Response.LoginResponse;
import com.example.GreenStitch_Assignment.Service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CandidateImpl implements CandidateService {

    @Autowired
    CandidateRepository candidateRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public String addCandidate(CandidateDto candidateDto) {

        Candidate candidate = new Candidate(

            candidateDto.getCandidateId(),
            candidateDto.getCandidateName(),
            candidateDto.getEmail(),

            this.passwordEncoder.encode(candidateDto.getPassword())

        );

        candidateRepository.save(candidate);
        return candidate.getCandidateName();
//        return "Candidate Added";
    }

    @Override
    public LoginResponse candidateLogin(LoginDto loginDto) {

        String message = "";
        Candidate candidate = candidateRepository.findByEmail(loginDto.getEmail());
        if(candidate != null){
            String password = loginDto.getPassword();
            String encodedPassword = candidate.getPassword();
            Boolean isPasswordCorrect = passwordEncoder.matches(password, encodedPassword);

            if(isPasswordCorrect){
                Optional<Candidate> candidate1 = candidateRepository
                        .findOneByEmailAndPassword(loginDto.getEmail(), encodedPassword);

                if(candidate1.isPresent()){
                    return new LoginResponse("Login Successfully", true);
                } else{
                    return new LoginResponse("Login Failed", false);
                }
            }else{
                return new LoginResponse("Password Not Match", false);
            }
        }else{
            return new LoginResponse("Email Not Exist", false);
        }


//        return null;
    }


}
