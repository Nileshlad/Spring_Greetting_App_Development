package com.restservice;

import com.pojo.User;

import java.util.List;
import java.util.Optional;

public interface IGreetingService {
    public User greet(User userDTO);

    public Optional<User> findGreetingById(Long userDTO);

    public List<User> findAllGreeting();

    public Optional<User> updateGreeting(Long userId);

    public List<User> deleteGreeting(Long userId);
}

