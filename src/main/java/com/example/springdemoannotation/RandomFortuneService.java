package com.example.springdemoannotation;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
    //create an array of strings
    private String[] data = {"Random Service 1","Random Service 2","Random Service 3"};
    private Random myRandom = new Random();
    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;
    }
}
