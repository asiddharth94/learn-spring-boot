package com.springboot.demo.learnspring.coach;

//import org.springframework.beans.factory.config.ConfigurableBeanFactory;
//import org.springframework.context.annotation.Scope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
// for BeanScopeController demo
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CricketCoach implements Coach {

//    define init method, run the server to see the log
    @PostConstruct
    public void doInit() {
        System.out.println("In the Bean Init Lifecycle");
    }

//    define destroy method, stop the server to see the log
    @PreDestroy
    public void doCleanup() {
        System.out.println("In the Bean Destroy Lifecycle");
    }

    @Override
    public String getDailyWorkout() {
        return "Shaam tak khelenge, G phat jaengi inki!";
    }
}
