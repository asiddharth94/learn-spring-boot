package com.springboot.demo.learnspring.coach;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Be like Ramos!";
    }
}
