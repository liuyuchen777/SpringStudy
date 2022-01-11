package com.example.consumerestservice;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote implements Serializable {

    private String type;
    private Greeting greeting;

    public Quote() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Greeting getGreeting() {
        return greeting;
    }

    public void setGreeting(Greeting value) {
        this.greeting = value;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "type='" + type + '\'' +
                ", greeting=" + greeting +
                '}';
    }
}
