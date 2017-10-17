package com.qoobico.remindme.server.controller;


import com.qoobico.remindme.server.entity.User;
import com.qoobico.remindme.server.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public User synchronize(@RequestBody User user){
        return service.authorization(user);
    }
}
