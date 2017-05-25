package com.pwr.service;


import com.pwr.mappers.UserMapper;
import com.pwr.model.UserEntity;
import com.pwr.model.UserTO;
import com.pwr.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserTO> findAllUsers() {
        List<UserTO> result = new ArrayList<UserTO>();
        userRepository.findAll().forEach(userEntity -> result.add(UserMapper.mapUser(userEntity)));
        return result;
    }

    @Override
    public void createUser(String login, String password, String name, String surname) {
      UserEntity user = new UserEntity();
      user.setLogin(login);
      user.setPassword(password);
      user.setName(name);

      user.setSurname(surname);
      userRepository.save(user);
    }

    @Override
    public void createUser(UserTO user) {
      userRepository.save(UserMapper.mapUser(user));
    }

   // @Override
   // public List<UserEntity> findByLogin(String login) {
    //  return userRepository.findByLogin(login);
   // }

    @Override
    public List<UserTO> findByLogin(String login) {
      ArrayList<UserTO> users = new ArrayList<UserTO>();
      for (UserEntity ue : userRepository.findByLogin(login)) {
        users.add(UserMapper.mapUser(ue));
      }
      return users;
    }

  @Override
  public boolean userIsValid(UserEntity entity) {
    if (entity.getLogin() == null || Objects.equals(entity.getLogin().trim(), "") || entity.getPassword() == null || Objects.equals(entity.getPassword().trim(), "")) {
        return false;
    }
    List<UserEntity> users = userRepository.findAll();
    for (UserEntity user: users) {
      if (Objects.equals(user.getLogin(), entity.getLogin()) && Objects.equals(user.getPassword(), entity.getPassword())) {
        return true;
      }
    }
    return false;
  }
}
