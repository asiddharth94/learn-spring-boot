package com.springboot.demo.learnspring;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Shaam tak khelenge, G phat jaengi inki!";
    }
}
