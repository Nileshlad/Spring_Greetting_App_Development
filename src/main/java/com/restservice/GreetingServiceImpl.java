package com.restservice;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements IGreetingService {

    private static final String template = "Hello world!";

    public String greet(String firstName, String lastName) {
        return template.replace("world", firstName + " " + lastName);

    }
}