package com.restservice;

import com.pojo.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public Greeting greetingWithUserName(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping(value = {"/param/{name}"})
    public Greeting greetingWithPathVariableUserName(@PathVariable(value = "name") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @PostMapping("/post")
    public Greeting greetingWithRequestBodyUserName(@RequestBody UserDTO user) {
        String template = "Hello, %s %s!";
        return new Greeting(counter.incrementAndGet(), String.format(template, user.getFirstName(), user.getLastName()));
    }
}