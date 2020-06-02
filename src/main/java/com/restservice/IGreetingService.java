package com.restservice;

import com.pojo.User;

import java.util.List;
import java.util.Optional;

public interface IGreetingService {
    public User greet(User user);

    public Optional<User> findGreetingById(Long userDTO);

    public List<User> findAllGreeting();
}

