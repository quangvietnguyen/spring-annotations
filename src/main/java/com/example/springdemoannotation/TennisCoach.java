package com.example.springdemoannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach{
    @Autowired
    @Qualifier("fileFortuneService")
    private FortuneService fortuneService;

    //define a default constructor
    public TennisCoach() {
        System.out.println(">> TenniesCoach: inside default constructor");
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
