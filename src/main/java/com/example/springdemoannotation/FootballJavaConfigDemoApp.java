package com.example.springdemoannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FootballJavaConfigDemoApp {
    public static void main(String[] args) {
        //read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        //get bean from spring container
        FootballCoach theCoach = context.getBean("footballCoach", FootballCoach.class);
        //call method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        //call the data from property file
        System.out.println("email: " + theCoach.getEmail());
        System.out.println("team: " + theCoach.getTeam());
        //close the context
        context.close();
    }
}
