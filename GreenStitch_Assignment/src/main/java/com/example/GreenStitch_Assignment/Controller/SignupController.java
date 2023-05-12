package com.example.GreenStitch_Assignment.Controller;

import com.example.GreenStitch_Assignment.DTO.CandidateDto;
import com.example.GreenStitch_Assignment.DTO.LoginDto;
import com.example.GreenStitch_Assignment.Response.LoginResponse;
import com.example.GreenStitch_Assignment.Service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.method.P;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class SignupController {

    @Autowired
    CandidateService candidateService;

    @PostMapping(path = "/add")
    public String addCandidate(@RequestBody CandidateDto candidateDto){
        return candidateService.addCandidate(candidateDto);
    }

    @PostMapping(path = "/addLogin")
    public ResponseEntity<?> candidateLogin(@RequestBody LoginDto loginDto){

        LoginResponse loginResponse = candidateService.candidateLogin(loginDto);
        return ResponseEntity.ok(loginResponse);

    }


}
