package com.cloudnativeplayground.aipoweredrecommendation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main entry point for the AI-powered Recommendation System application.
 * This application leverages Spring Boot and TensorFlow for personalized content recommendations.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("AI-powered Recommendation System is up and running!");
    }
}
