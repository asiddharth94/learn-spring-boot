package com.springboot.demo.learnspring.coach;

//import org.springframework.beans.factory.config.ConfigurableBeanFactory;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// for BeanScopeController demo
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Shaam tak khelenge, G phat jaengi inki!";
    }
}
