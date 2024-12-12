package com.example.SpringCoreDemo.config;

import com.example.SpringCoreDemo.common.Coach;
import com.example.SpringCoreDemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
