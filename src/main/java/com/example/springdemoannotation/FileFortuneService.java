package com.example.springdemoannotation;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FileFortuneService implements FortuneService{
    private String fileName = "src/main/resources/fortunes.txt";
    private List<String> theFortunes;
    Random myRandom = new Random();
    @PostConstruct
    public void FileFortuneService() {
        File theFile = new File(fileName);
        theFortunes = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(new FileReader(theFile))) {
            String tempLine;
            while ((tempLine = br.readLine()) != null) {
                theFortunes.add(tempLine);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(" >> PostConstruct File Fortune Service: " + theFortunes);
    }

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(theFortunes.size());
        String theFortune = theFortunes.get(index);
        return theFortune;
    }
}
