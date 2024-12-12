package com.example.SpringCoreDemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class DriftCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice your clutch kick!";
    }

    @PostConstruct
    public void doStartupStuff(){
        System.out.println("Doing some startup stuff!");
    }

    @PreDestroy
    public void doCleanupStuff(){
        System.out.println("Doing some cleaning!");
    }
}
