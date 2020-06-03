package com.service;

import com.dto.UserDTO;
import com.model.User;

import java.util.List;
import java.util.Optional;

public interface IGreetingService {
    public UserDTO greet(UserDTO userDTO);

    public Optional<User> findGreetingById(Long userDTO);

    public List<User> findAllGreeting();

    public Optional<User> updateGreeting(Long userId);

    public List<User> deleteGreeting(Long userId);
}


