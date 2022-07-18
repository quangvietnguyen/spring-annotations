package com.example.springdemoannotation;

public class SadFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Sad day";
    }
}
