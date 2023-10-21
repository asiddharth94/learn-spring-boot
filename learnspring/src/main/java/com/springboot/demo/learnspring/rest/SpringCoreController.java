package com.springboot.demo.learnspring.rest;

import com.springboot.demo.learnspring.coach.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringCoreController {

//    define a private field for dependency
    private Coach myCoach;

//    define a constructor for DI
//    @Autowired
//    public SpringCoreController(@Qualifier("cricketCoach") Coach coach) {
//        myCoach = coach;
//    }

//    define a setter for DI
//    @Autowired
//    public void setCoach (@Qualifier("footballCoach") Coach coach) {
//        myCoach = coach;
//    }

//    constructor injection for @Bean demo
public SpringCoreController(@Qualifier("swimCoach") Coach coach) {
    myCoach = coach;
}

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
