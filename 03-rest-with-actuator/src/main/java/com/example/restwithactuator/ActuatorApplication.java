package com.example.restwithactuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * check postman!!!
 *
 * 1. localhost:8080/actuator/health
 * {
 *     "status": "UP"
 * }
 * UP -> service is running
 *
 * 2.
 */

@SpringBootApplication
public class ActuatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActuatorApplication.class, args);
    }

}
