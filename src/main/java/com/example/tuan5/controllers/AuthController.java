package com.example.tuan5.controllers;

import com.example.tuan5.backend.models.Candidate;
import com.example.tuan5.backend.services.CandidateServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {


    @Autowired
    private CandidateServices candidateServices;

    @GetMapping("/login")
    public String login() {
        return "auth/login";
    }

    //i have one param is email
    @PostMapping("/login")
    public String login(String email, Model model) {
        Candidate candidate = candidateServices.findByEmail(email);
        if (candidate == null) {
            return "redirect:/auth/login";
        } else {
            model.addAttribute("candidate", candidate);
            return "redirect:/";

        }

    }
}
