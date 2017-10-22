package com.qoobico.remindme.server.service.user;

import com.qoobico.remindme.server.entity.User;
import com.qoobico.remindme.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User authorization(User user) {

        List<User> users = userRepository.findAll();
        for (User userNow : users) {
            if (user.getUsername() == userNow.getUsername() && user.getPassword() == userNow.getUsername())
                return userNow;
        }

        return null;
    }

    @Override
    public User search(String username) {
        List<User> users = userRepository.findAll();
        for (User userNow : users) {
            if (username == userNow.getUsername())
                return userNow;
        }

        return null;
    }

    @Override
    public void registration(User user) {
        userRepository.saveAndFlush(user);
    }
}
