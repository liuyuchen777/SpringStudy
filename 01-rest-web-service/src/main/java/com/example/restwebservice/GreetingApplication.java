package com.example.restwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication is a convenience annotation that adds all of the following:
 * - @Configuration
 * - @EnableAutoConfiguration
 * - @ComponentScan
 */

@SpringBootApplication
public class GreetingApplication {

    public static void main(String[] args) {

        SpringApplication.run(GreetingApplication.class, args);
    }

}
