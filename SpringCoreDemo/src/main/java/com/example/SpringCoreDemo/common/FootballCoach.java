package com.example.SpringCoreDemo.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice your passing!";
    }
}
