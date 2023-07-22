package com.project.sep.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class FeedApplication {

    public static void main(String[] args) {

        SpringApplication.run(FeedApplication.class, args);
    }
}