package com.example.springdemoannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        //load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve bean from spring container
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
        Coach betaCoach = context.getBean("tennisCoach", Coach.class);
        //check if they are the same
        boolean result = (alphaCoach == betaCoach);
        //Print result
        System.out.println("\nPoint to the same object: " + result);
        System.out.println("\nalphaCoach: " + alphaCoach);
        System.out.println("\nbetaCoach: " + betaCoach + "\n");
        context.close();
    }
}
