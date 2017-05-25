package com.pwr.mappers;

import com.pwr.model.UserEntity;
import com.pwr.model.UserTO;


public class UserMapper {

  private UserMapper() {

  }

  public static UserTO mapUser(UserEntity userEntity) {
    UserTO user = new UserTO();
    user.setId(userEntity.getId());
    user.setLogin(userEntity.getLogin());
    user.setPassword(userEntity.getPassword());
    user.setName(userEntity.getName());
    user.setSurname(userEntity.getSurname());
    return user;
  }

  public static UserEntity mapUser(UserTO userTO) {
    UserEntity user = new UserEntity();
    user.setId(userTO.getId());
    user.setLogin(userTO.getLogin());
    user.setPassword(userTO.getPassword());
    user.setName(userTO.getName());
    user.setSurname(userTO.getSurname());
    return user;
  }
}
