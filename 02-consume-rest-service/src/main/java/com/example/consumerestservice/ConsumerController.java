package com.example.consumerestservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    private static final String urlLocal = "http://localhost:8081";
    private static final String urlREST = "http://localhost:8080";
    private final Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    // consume local API
    @RequestMapping("/getHello")
    public String getHelloClient(RestTemplate restTemplate) {
        return restTemplate.getForObject(urlLocal + "/hello", String.class);
    }

    // consume API in module 01
    @RequestMapping("/getGreetings")
    public Greeting getGreeting(RestTemplate restTemplate) {
        Greeting greeting = restTemplate.getForObject(urlREST + "/greeting", Greeting.class);

        logger.info(greeting.toString());

        return greeting;
    }
}
