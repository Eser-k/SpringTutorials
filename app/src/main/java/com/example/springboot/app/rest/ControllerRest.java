package com.example.springboot.app.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerRest {
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String helloPage(){
        return "Hello, Welcome to this Demo Web App!";
    }

    @GetMapping("/teaminfo")
    public String teamInfo(){
        return "Coach: " + coachName + ", Team: " + teamName;
    }
}
