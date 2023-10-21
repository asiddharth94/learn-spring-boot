package com.springboot.demo.learnspring.springcore.config;

import com.springboot.demo.learnspring.springcore.coach.Coach;
import com.springboot.demo.learnspring.springcore.coach.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
