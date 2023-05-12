package com.example.GreenStitch_Assignment.Service;

import com.example.GreenStitch_Assignment.DTO.CandidateDto;
import com.example.GreenStitch_Assignment.DTO.LoginDto;
import com.example.GreenStitch_Assignment.Response.LoginResponse;

public interface CandidateService {


    String addCandidate(CandidateDto candidateDto);

    LoginResponse candidateLogin(LoginDto loginDto);


}
