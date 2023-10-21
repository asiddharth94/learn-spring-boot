package com.springboot.demo.learnspring.rest;

import com.springboot.demo.learnspring.coach.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//controller to check Bean Scopes. Needs marking the CricketCoach with @Scope
@RestController
public class BeanScopeController {

    private Coach myCoach;
    private Coach myAnotherCoach;

    //    setting up constructor injection
    @Autowired
    public BeanScopeController(@Qualifier("cricketCoach") Coach coach, @Qualifier("cricketCoach") Coach anotherCoach) {
        myCoach = coach;
        myAnotherCoach = anotherCoach;
    }

    @GetMapping("/checkbeanscope")
    public String check() {
//        returns TRUE for Singleton, FALSE for prototype
        return "Bean Scope is " + (myCoach == myAnotherCoach);
    }
}
