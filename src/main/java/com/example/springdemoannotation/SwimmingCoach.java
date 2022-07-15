package com.example.springdemoannotation;

import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Swimming Coach Workout";
    }
    @Override
    public String getDailyFortune() { return ""; }
}
