package com.example.consumerestservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * To consume a RESTful service, first you need a RESTful service
 * You can use this: https://quoters.apps.pcfone.io/api/random
 * It randomly fetches quotations about Spring Boot and returns them as JSON documents. Like this
 * {
 *    type: "success",
 *    value: {
 *       id: 10,
 *       quote: "Really loving Spring Boot, makes stand alone Spring apps easy."
 *    }
 * }
 *
 * Notice: this API is no longer accessible!!!
 */

@SpringBootApplication
public class ConsumingRestApplication {

    public static void main(String[] args) {

        SpringApplication.run(ConsumingRestApplication.class, args);
    }

    // inject RestTemplate
    @Bean
    RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
