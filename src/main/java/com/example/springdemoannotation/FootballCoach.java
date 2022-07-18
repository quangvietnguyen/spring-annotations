package com.example.springdemoannotation;

public class FootballCoach implements Coach{
    private FortuneService fortuneService;
    public FootballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Football in the afternoon";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
