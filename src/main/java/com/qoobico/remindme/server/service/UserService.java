package com.qoobico.remindme.server.service.user;

import com.qoobico.remindme.server.entity.User;

public interface UserService {
    User authorization(User user);
    User search(String username);
    void registration(User user);
}
