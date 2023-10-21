package com.springboot.demo.learnspring.config;

import com.springboot.demo.learnspring.coach.Coach;
import com.springboot.demo.learnspring.coach.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
