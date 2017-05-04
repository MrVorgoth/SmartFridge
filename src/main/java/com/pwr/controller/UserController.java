package com.pwr.controller;

import com.pwr.model.UserTO;
import com.pwr.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RestController
@RequestMapping(path = "user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(path = "all", method = RequestMethod.GET)
    public List<UserTO> findAllUsers() {
        return userService.findAllUsers();
    }

    @RequestMapping(path = "create", method = RequestMethod.GET)
    public void createUser() {
        userService.createUser();
    }

}
