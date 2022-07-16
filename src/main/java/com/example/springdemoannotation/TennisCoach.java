package com.example.springdemoannotation;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class TennisCoach implements Coach, DisposableBean {
    @Autowired
    @Qualifier("fileFortuneService")
    private FortuneService fortuneService;

    //define a default constructor
    public TennisCoach() {
        System.out.println(">> TenniesCoach: inside default constructor");
    }

    //define init method
    @PostConstruct
    public void doSomeInitStuffs() {
        System.out.println(">> TennisCoach: inside doSomeInitStuffs method");
    }
    //define destroy method
    /*
    @PreDestroy
    public void doSomeDestroyStuffs() {
        System.out.println(">> TennisCoach: inside doSomeDestroyStuffs method");
    }
    */
    @Override
    public void destroy() throws Exception {
        System.out.println(">> TennisCoach: inside destroy()");
    }

    /*
    //define setter method
    @Autowired
    public void setFortuneService(FortuneService theFortuneService) {
        System.out.println(">> TenniesCoach: inside setter");
        fortuneService = theFortuneService;
    }
    */
    /*
        @Autowired
        public TennisCoach(FortuneService theFortuneService) {
            fortuneService = theFortuneService;
        }
    */
    @Override
    public String getDailyWorkout() {
        return "Tennis Coach Workout";
    }
    @Override
    public String getDailyFortune() { return fortuneService.getFortune(); }
}
