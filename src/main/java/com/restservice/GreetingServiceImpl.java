package com.restservice;

import com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingServiceImpl implements IGreetingService {

    @Autowired
    private ModelMapper modelMapper;

    private static final String template = "Hello world!";

    @Override
    public User greet(User user) {
        if (user.getFirstName() == null && user.getLastName() == null)
            user.setUserGreeting(template);
        else if (user.getLastName() == null)
            user.setUserGreeting(template.replace("world", user.getFirstName()));
        else if (user.getFirstName() == null)
            user.setUserGreeting(template.replace("world", user.getLastName()));
        user.setUserGreeting(template.replace("world", user.getFirstName() + " " + user.getLastName()));
        User regUser = modelMapper.map(user, User.class);
        userRepository.save(regUser);
        user.setId(regUser.getId());
        return user;
    }
    @Override
    public Optional<User> findGreetingById(Long id) {
        return userRepository.findById(id);
    }
    @Override
    public List<User> findAllGreeting() {
        return userRepository.findAll();
    }
    }
