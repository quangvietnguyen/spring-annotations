package com.example.springdemoannotation;

import org.springframework.beans.factory.annotation.Value;

public class FootballCoach implements Coach{
    private FortuneService fortuneService;
    @Value("${viet.email}")
    private String email;
    @Value("${viet.team}")
    private String team;
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

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
