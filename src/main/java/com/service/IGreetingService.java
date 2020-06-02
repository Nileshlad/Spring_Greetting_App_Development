package com.service;

import com.dto.User;

import java.util.List;
import java.util.Optional;

public interface IGreetingService {
    public User greet(User user);

    public Optional<User> findGreetingById(Long user);

    public List<User> findAllGreeting();

    public Optional<User> updateGreeting(Long userId);

    public List<User> deleteGreeting(Long userId);


}

