package com.example.springdemoannotation;

import org.springframework.stereotype.Component;

@Component
public class DataBaseService implements FortuneService{
    @Override
    public String getFortune() {
        return "Database Fortune Service";
    }
}
