package com.pwr.service;


import com.pwr.model.UserEntity;
import com.pwr.model.UserTO;

import java.util.List;

public interface IUserService {

   public List<UserTO> findAllUsers();

   public void createUser(UserTO user);

   public void createUser(String login, String password, String name, String surname);

   public List<UserTO> findByLogin(String login);

   public boolean userIsValid(UserEntity user);
}
