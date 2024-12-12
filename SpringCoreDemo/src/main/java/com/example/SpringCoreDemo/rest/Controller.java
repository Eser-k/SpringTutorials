package com.example.SpringCoreDemo.rest;

import com.example.SpringCoreDemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private Coach myCoach;
    private Coach anotherCoach;
    private Coach configCoach;

    @Autowired
    public Controller(@Qualifier("driftCoach") Coach myCoach,
                      @Qualifier("driftCoach") Coach anotherCoach,
                      @Qualifier("swimCoach") Coach configCoach){
        this.myCoach = myCoach;
        this.anotherCoach = anotherCoach;
        this.configCoach = configCoach;
    }

    /* Setter Injection
    @Autowired
    public void setCoach(Coach myCoach){
        this.myCoach = myCoach;
    }
    */

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/configdailyworkout")
    public String configGetDailyWorkout(){
        return configCoach.getDailyWorkout();
    }

    // true for Singleton
    // false for Prototype
    @GetMapping("/check")
    public String check(){
        return "Comparing myCoach and anotherCoach: " + (myCoach == anotherCoach);
    }
}
