package com.example.restwebservice;

public class Wrapper {

    private final String type;
    private final Greeting greeting;

    public Wrapper(String type, Greeting greeting) {
        this.type = type;
        this.greeting = greeting;
    }

    public Greeting getGreeting() {
        return greeting;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Wrapper{" +
                "type='" + type + '\'' +
                ", greeting=" + greeting +
                '}';
    }
}
