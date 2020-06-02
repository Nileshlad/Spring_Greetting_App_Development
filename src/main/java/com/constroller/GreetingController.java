package com.constroller;

import com.pojo.Greeting;
import com.pojo.User;
import com.restservice.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    @Autowired
    private GreetingServiceImpl GreetingService;
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
        public Greeting greetingWithRequestBodyUserName(@RequestBody User user) {
            String template = "Hello, %s %s!";
            return new Greeting(counter.incrementAndGet(), String.format(template, user.getFirstName(), user.getLastName()));
        }

    @PutMapping("/put/{firstName}")
    public Greeting greetingPathVariableAndRequestParam(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        String template = "Hello, %s %s!";
        return new Greeting(counter.incrementAndGet(), String.format(template, firstName, lastName));
    }

    @PostMapping("/getGreeting")
    public User register(@RequestBody User user) {
        return GreetingService.greet(user);
    }

    @RequestMapping("/getGreetingById/{userId}")
    public Optional<User> findGreeting(@PathVariable Long userId) {
        return greetingService.findGreetingById(userId);
    }
}