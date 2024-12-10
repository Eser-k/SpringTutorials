package com.example.SpringCoreDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private Coach myCoach;

    @Autowired
    public Controller(Coach myCoach){
        this.myCoach = myCoach;
    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
