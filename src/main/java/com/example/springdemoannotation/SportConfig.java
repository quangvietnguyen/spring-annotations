package com.example.springdemoannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan("com.example.springdemoannotation")
public class SportConfig {
    //define bean for sad fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    //define bean for football coach and inject dependency
    @Bean
    public Coach footballCoach() {
        return new FootballCoach(sadFortuneService());
    }
}
