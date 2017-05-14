package com.pwr.controller;

import com.pwr.mappers.UserMapper;
import com.pwr.model.UserEntity;
import com.pwr.model.UserTO;
import com.pwr.repository.UserRepository;
import com.pwr.service.IUserService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "user")
public class UserController {

  @Autowired
  private IUserService userService;
  @Autowired
  private UserRepository userRepository;

  @RequestMapping(path = "all", method = RequestMethod.GET)
  @ResponseBody
  public List<UserTO> findAllUsers() {
    return userService.findAllUsers();
  }

  @RequestMapping(path = "create", method = RequestMethod.GET)
  @ResponseBody
  public int createUser(
    @RequestParam("login") String login,
    @RequestParam("password") String password,
    @RequestParam("name") String name,
    @RequestParam("surname") String surname
  ) {
    List<UserEntity> users = userRepository.findAll();
    for (UserEntity user : users) {
      if (user.getLogin().equals(login)) {
        return HttpServletResponse.SC_CONFLICT;
      }
    }

    userService.createUser(login, password, name, surname);
    return HttpServletResponse.SC_OK;
  }

  @RequestMapping(path = "create", method = RequestMethod.POST, consumes = "application/json")
  @ResponseBody
  public UserTO createUser(@RequestBody UserTO user) {
    userService.createUser(user);
    return user;
  }

  @RequestMapping(path = "search", method = RequestMethod.GET)
  public List<UserTO> test(@RequestParam("login") String login) {
    return userService.findByLogin(login);
  }

  @RequestMapping(path = "validate", method = RequestMethod.POST)
  public void validateLogin(HttpServletResponse response, @RequestBody UserEntity user) {
    if (userService.userIsValid(user)) {
      response.setStatus(HttpServletResponse.SC_OK);
    } else {
      response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
    }
  }
}

